package com.example.cinema.repository;

import com.example.cinema.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieInter extends JpaRepository<Movie,Integer> {
    Movie findByTitle();
    List<Movie> findAll();
    Movie delete();
    Movie save();
}
