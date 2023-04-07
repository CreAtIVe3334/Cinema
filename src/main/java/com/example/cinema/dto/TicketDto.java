package com.example.cinema.dto;


import com.example.cinema.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {
    private Integer id;
    private Integer seatNumber;
    private State state;

}
