package com.example.cinema.entity;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
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
    @NotNull(message = "Start time cannot be null")
    private LocalTime startTime;
    @NotNull(message = "End time cannot be null")
    private LocalTime endTime;
    @OneToMany
    @JoinTable(name = "screening_ticket",joinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "ticket_id",referencedColumnName = "id")})
    private List<Ticket> tickets;

}
