package com.works.services;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerRegisterDto;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer register(CustomerRegisterDto customerRegisterDto) {
        ModelMapper modelMapper = new ModelMapper();
        Customer customer = modelMapper.map(customerRegisterDto, Customer.class);
        return customerRepository.save(customer);
    }

}
