package com.example.cinema.service;

import com.example.cinema.dto.*;
import com.example.cinema.entity.CinemaHall;
import com.example.cinema.entity.Movie;
import com.example.cinema.entity.Screening;
import com.example.cinema.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DtoService {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ScreeningService screeningService;
    @Autowired
    private TicketSevice ticketSevice;


    public static MovieDto moviesDto(Movie movie){
        return MovieDto.builder()
                .title(movie.getTitle())
                .genre(movie.getGenre())
                .date(movie.getDate())
                .build();
    }


    public static SeansDto seansDto(CinemaHall cinemaHall){
        List<Screening> screenings = cinemaHall.getScreenings();
        List<ScreeningDto> screeningDtos = new ArrayList<>();
        for (Screening screening:screenings){
            screeningDtos.add(screeningDto(screening));
        }
        return SeansDto.builder().cinemaHall(cinemaHall.getName()).screeningDtos(screeningDtos).build();
    }

    public static PriceTicketDto priceTicketDto(Ticket ticket){
        return PriceTicketDto.builder().price(ticket.getPrice()).build();
    }

    public static ScreeningDto screeningDto(Screening screening){
        List<Ticket> tickets = screening.getTickets();
        List<PriceTicketDto> priceTicketDtos = new ArrayList<>();
        for (Ticket ticket :tickets){
            priceTicketDtos.add(priceTicketDto(ticket));
        }
        return ScreeningDto.builder().startTime(screening.getStartTime()).priceTicketDtos(priceTicketDtos).build();
    }

    public static TicketDto ticketDto(Ticket ticket){
        return TicketDto.builder().id(ticket.getId()).seatNumber(ticket.getSeatNumber()).state(ticket.getState()).build();
    }

}
