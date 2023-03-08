package com.example.cinema.service;

import com.example.cinema.entity.CinemaHall;
import com.example.cinema.repository.CinemaHallReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaHallService {
    @Autowired
    CinemaHallReposi cinemaHallReposi;

    CinemaHall save(CinemaHall cinemaHall){
        return cinemaHallReposi.save(cinemaHall);
    }
}
