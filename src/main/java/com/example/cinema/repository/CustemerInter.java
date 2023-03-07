package com.example.cinema.repository;

import com.example.cinema.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustemerInter extends JpaRepository<Customer,Integer> {
    Customer save();
    Customer findByName();
    Customer findByTickets();

}
