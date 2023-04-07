package com.example.cinema.service;

import com.example.cinema.entity.Customer;
import com.example.cinema.repository.CustemerReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustemerReposi custemerReposi;

    Customer registration(Customer customer){
        return custemerReposi.save(customer);
    }
    Customer update(Customer customer){
        return custemerReposi.save(customer);
    }

    Customer findByPhoneNumber(String phoneNumber){
        return custemerReposi.findByPhoneNumber(phoneNumber);
    }

}
