package com.example.cinema.entity;

import com.example.cinema.enums.State;
import com.example.cinema.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer seatNumber;
    private BigDecimal price;
    private State state;
    private Status status;


}
