package com.works.services;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerLoginDto;
import com.works.entities.dto.CustomerRegisterDto;
import com.works.repositories.CustomerRepository;
import com.works.utils.SecurityUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;

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
        Optional<Customer> optionalCustomer = customerRepository.findByEmailEqualsIgnoreCase(customerLoginDto.getEmail());
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            String newPass = tinkEncDec.decrypt( customer.getPassword() );
            if ( newPass.equals( customerLoginDto.getPassword() ) ) {
                request.getSession().setAttribute("user", customer);
                SecurityUtil.customerSession = customer;
                return new ResponseEntity(customer, HttpStatus.OK);
            }
        }
        Map<String, Object> mp = new LinkedHashMap<>();
        mp.put("status", false);
        mp.put("message", "Username or password fail!");
        return new ResponseEntity(mp,HttpStatus.UNAUTHORIZED);
    }

    int i = 0;
    // @Scheduled(fixedDelay = 5000, timeUnit = TimeUnit.MILLISECONDS)
    public void autoCall() {
        i++;
        System.out.println("autoCall Call : " + i);
    }

    public void call() {
        Timer timer = new Timer();
        timer.schedule(task, 5000);
    }
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println("autoCall Call : " + i);
        }
    };


}
