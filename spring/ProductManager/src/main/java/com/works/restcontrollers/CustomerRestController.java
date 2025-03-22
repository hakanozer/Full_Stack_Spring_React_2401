package com.works.restcontrollers;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerLoginDto;
import com.works.entities.dto.CustomerRegisterDto;
import com.works.services.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerRestController {

    final CustomerService customerService;

    @PostMapping("register")
    public Customer register(@Valid @RequestBody CustomerRegisterDto customerRegisterDto){
        return customerService.register(customerRegisterDto);
    }

    @PostMapping("login")
    public ResponseEntity login(@Valid @RequestBody CustomerLoginDto customerLoginDto){
        return customerService.login(customerLoginDto);
    }

}
