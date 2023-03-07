package com.example.cinema.repository;

import com.example.cinema.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketInter extends JpaRepository<Ticket,Integer> {
    Ticket save();
}
