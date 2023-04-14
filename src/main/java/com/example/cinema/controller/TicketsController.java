package com.example.cinema.controller;

import com.example.cinema.dto.ScreeningDto;
import com.example.cinema.dto.TicketDto;
import com.example.cinema.entity.Customer;
import com.example.cinema.entity.Ticket;
import com.example.cinema.service.TicketSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketsController {


    @Autowired
    TicketSevice ticketSevice;

    @GetMapping("/seats")
    public ResponseEntity<List<TicketDto>> getSeats(@PathVariable Integer id){
        return new ResponseEntity<List<TicketDto>>(ticketSevice.getSeats(id), HttpStatus.OK);
    }

    @PostMapping("/buy")
    public ResponseEntity<Ticket> buy(@RequestBody Customer customer, @PathVariable String ticketId) throws Exception {
        return new ResponseEntity<Ticket>(ticketSevice.buy(customer,ticketId),HttpStatus.ACCEPTED);
    }

}
