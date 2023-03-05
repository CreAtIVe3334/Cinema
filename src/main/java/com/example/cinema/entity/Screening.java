package com.example.cinema.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Builder
public class Screening {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalTime startTime;
    private LocalTime endTime;
    @OneToMany
    @JoinTable(name = "screening_ticket",joinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "ticket_id",referencedColumnName = "id")})
    private List<Ticket> tickets;

}
