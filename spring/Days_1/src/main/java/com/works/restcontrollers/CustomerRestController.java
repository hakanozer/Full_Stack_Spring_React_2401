package com.works.restcontrollers;

import com.works.entities.Customer;
import com.works.services.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerRestController {

    final CustomerService customerService;

    @PostMapping("register")
    public ResponseEntity register(@Valid @RequestBody Customer customer){
        try {
            customerService.saveCustomer(customer);
            return new ResponseEntity(customer, HttpStatus.OK);
        }catch (Exception ex) {
            String msg = ex.getMessage();
            if(msg.contains("Unique index")){
                msg = "email in use ";
            }
            return new ResponseEntity( msg+customer.getEmail(), HttpStatus.BAD_REQUEST);
        }
    }

    /*
    @PostMapping("register")
    public Object register(@Valid @RequestBody Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldErrors();
        }
        return customerService.saveCustomer(customer);
    }
     */



}













