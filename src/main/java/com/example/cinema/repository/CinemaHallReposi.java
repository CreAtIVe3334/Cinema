package com.example.cinema.repository;

import com.example.cinema.entity.CinemaHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallReposi extends JpaRepository<CinemaHall,Integer> {


}
