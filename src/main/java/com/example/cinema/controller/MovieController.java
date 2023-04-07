package com.example.cinema.controller;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.dto.SeansDto;
import com.example.cinema.entity.CinemaHall;
import com.example.cinema.entity.Movie;
import com.example.cinema.service.CinemaHallService;
import com.example.cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private CinemaHallService cinemaHallService;

    @GetMapping("/movies")
    public ResponseEntity<List<MovieDto>> getMovies(@RequestBody Movie movie){
        return new ResponseEntity<List<MovieDto>>(movieService.getMovies(), HttpStatus.OK);
    }


    @GetMapping("/seans")
    public ResponseEntity<List<SeansDto>> getSeans(){
        return new ResponseEntity<List<SeansDto>>(cinemaHallService.getAllSeans(), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Movie> insert(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.save(movie), HttpStatus.CREATED);
    }

}
