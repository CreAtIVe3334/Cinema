package com.example.cinema.controller;

import com.example.cinema.entity.Movie;
import com.example.cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/insert")
    public ResponseEntity<Movie> insert(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.save(movie), HttpStatus.CREATED);
    }

}
