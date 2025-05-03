package com.works.services;

import com.works.entities.Customer;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

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
