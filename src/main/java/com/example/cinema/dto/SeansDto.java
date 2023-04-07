package com.example.cinema.dto;

import com.example.cinema.entity.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeansDto {
    private String cinemaHall;
    private List<ScreeningDto> screeningDtos;
    private BigDecimal price;


}
