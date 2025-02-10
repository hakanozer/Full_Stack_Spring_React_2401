package com.works.services;

import com.works.entities.Customer;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
// @Service -> veritabanı olaylarını yönetmenin en iyi yoludur.
// rollBack -> davranışını otomatik yapar.
// doğrulama, if'ler, for'lar hep burada yazılır.
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        // save
        // insert into customer values(null, ?, ?, ?, ?)
        customerRepository.save(customer);
        return customer;
    }


}
