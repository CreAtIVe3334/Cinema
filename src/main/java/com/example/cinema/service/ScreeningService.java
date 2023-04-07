package com.example.cinema.service;

import com.example.cinema.entity.Screening;
import com.example.cinema.repository.ScreeningReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ScreeningService {

    @Autowired
    ScreeningReposi screeningReposi;

    public Screening getScreeningById(Integer id) {
        return screeningReposi.findById(id).get();
    }
}
