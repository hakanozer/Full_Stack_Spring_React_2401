package com.works.services;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerLoginDto;
import com.works.entities.dto.CustomerRegisterDto;
import com.works.repositories.CustomerRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {


    private final CustomerRepository customerRepository;
    private final ModelMapper objModelMapper;
    private final HttpServletRequest request;
    private final TinkEncDec tinkEncDec;

    public Customer register(CustomerRegisterDto customerRegisterDto) {
        String newPass = tinkEncDec.encrypt( customerRegisterDto.getPassword() );
        Customer customer = objModelMapper.map(customerRegisterDto, Customer.class);
        customer.setPassword( newPass );
        return customerRepository.save(customer);
    }

    public ResponseEntity login(CustomerLoginDto customerLoginDto) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmailEqualsIgnoreCaseAndPasswordEquals(customerLoginDto.getEmail(), customerLoginDto.getPassword());
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            // oturum açılıyor
            customer.setPassword(null);
            request.getSession().setAttribute("user", customer);
            return new ResponseEntity(customer, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }



}
