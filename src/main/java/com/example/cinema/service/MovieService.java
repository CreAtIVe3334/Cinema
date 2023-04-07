package com.example.cinema.service;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.entity.Movie;
import com.example.cinema.repository.MovieReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieReposi movieReposi;

    public Movie save(Movie movie){
        return movieReposi.save(movie);
    }
    public List<Movie> findAll(){
        return movieReposi.findAll();
    }

    public List<Movie> findAllMovie(){
        return movieReposi.findAll();
    }

    public List<MovieDto> getMovies(){
        List<Movie> movies = movieReposi.findAll();
        List<MovieDto> movieDtos = new ArrayList<>();
         for (Movie movie:movies){
             movieDtos.add(DtoService.moviesDto(movie));
         }
         return movieDtos;
    }

}
