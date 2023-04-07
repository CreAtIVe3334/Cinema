package com.example.cinema.service;

import com.example.cinema.dto.SeansDto;
import com.example.cinema.entity.CinemaHall;
import com.example.cinema.repository.CinemaHallReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaHallService {
    @Autowired
    CinemaHallReposi cinemaHallReposi;

    CinemaHall save(CinemaHall cinemaHall){
        return cinemaHallReposi.save(cinemaHall);
    }

    public List<SeansDto> getAllSeans(){
        List<CinemaHall> cinemaHalls = cinemaHallReposi.findAll();
        List<SeansDto> seansDtos = new ArrayList<>();
        for(CinemaHall cinemaHall: cinemaHalls){
            seansDtos.add(DtoService.seansDto(cinemaHall));
        }
        return seansDtos;
    }
}
