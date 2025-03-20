package com.works.services;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerRegisterDto;
import com.works.repositories.CustomerRepository;
import com.works.utils.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    //@Autowired
    //ModelMapper objModelMapper;

    private final CustomerRepository customerRepository;
    private final ModelMapper objModelMapper;
    private final ModelMapper objConfigModelMapper;
    private final SecurityUtil securityUtil;


    public Customer register(CustomerRegisterDto customerRegisterDto) {
        Customer customer = objModelMapper.map(customerRegisterDto, Customer.class);
        securityUtil.call1();
        return customerRepository.save(customer);
    }



}
