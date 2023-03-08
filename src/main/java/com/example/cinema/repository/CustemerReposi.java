package com.example.cinema.repository;

import com.example.cinema.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustemerReposi extends JpaRepository<Customer,Integer> {
        Customer findByPhoneNumber(String phoneNumber);

}
