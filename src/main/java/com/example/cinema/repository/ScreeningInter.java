package com.example.cinema.repository;

import com.example.cinema.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningInter extends JpaRepository<Screening,Integer> {
    Screening save();

}
