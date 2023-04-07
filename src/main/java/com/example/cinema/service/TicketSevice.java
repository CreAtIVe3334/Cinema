package com.example.cinema.service;

import com.example.cinema.dto.TicketDto;
import com.example.cinema.entity.Customer;
import com.example.cinema.entity.Ticket;
import com.example.cinema.enums.State;
import com.example.cinema.repository.CustemerReposi;
import com.example.cinema.repository.ScreeningReposi;
import com.example.cinema.repository.TicketReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketSevice {
    @Autowired
    TicketReposi ticketReposi;

    @Autowired
    ScreeningReposi screeningReposi;

    @Autowired
    CustemerReposi custemerReposi;


    public List<TicketDto> getSeats(Integer screeningId){
        List<Ticket> tickets= screeningReposi.findById(screeningId).get().getTickets();
        List<TicketDto> ticketDtos = new ArrayList<>();
        for (Ticket ticket:tickets){
            ticketDtos.add(DtoService.ticketDto(ticket));
        }
        return ticketDtos;
    }

    public Ticket buy(Customer customer,String ticketId){
        Ticket ticket = ticketReposi.findById(ticketId);
        ticket.setState(State.SOLD);
        custemerReposi.save(customer);
        ticketReposi.save(ticket);
        return ticket;


    }

}
