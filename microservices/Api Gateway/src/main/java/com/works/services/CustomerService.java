package com.works.services;

import com.works.entities.Customer;
import com.works.entities.Role;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class CustomerService implements UserDetailsService {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTService jwtService;
    private final AuthenticationConfiguration configuration;

    public ResponseEntity login(Customer customer) {
        Map<String,Object> map = new LinkedHashMap<>();
        try {
            configuration.getAuthenticationManager().authenticate(
                    new UsernamePasswordAuthenticationToken(customer.getUsername(), customer.getPassword())
            );
            UserDetails userDetails = loadUserByUsername(customer.getUsername());
            String jwt = jwtService.generateToken(userDetails);
            map.put("jwt", jwt);
            Optional<Customer> customerOptional = customerRepository.findByUsernameEqualsIgnoreCase(customer.getUsername());
            map.put("customer", customerOptional.get());
            return ResponseEntity.ok(map);
        }catch (Exception e){
            map.put("status", 401);
            map.put("error", e.getMessage());
            return new ResponseEntity(map, HttpStatus.UNAUTHORIZED);
        }
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> customerOptional = customerRepository.findByUsernameEqualsIgnoreCase(username);
        if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
            return new User(
                    customer.getUsername(),
                    customer.getPassword(),
                    customer.getEnable(),
                    true,
                    true,
                    true,
                    parseRole(customer.getRoles())
            );
        }
        throw new UsernameNotFoundException("Username Not Found");
    }

    private Collection<? extends GrantedAuthority> parseRole(List<Role> roles) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Role role : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return grantedAuthorities;
    }

    public Customer register(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findByUsernameEqualsIgnoreCase(customer.getUsername());
        if (customerOptional.isPresent()) {
            return null;
        }else {
            String encodedPassword = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(encodedPassword);
            return customerRepository.save(customer);
        }
    }



}
