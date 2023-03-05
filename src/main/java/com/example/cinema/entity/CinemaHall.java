package com.example.cinema.entity;

import com.example.cinema.enums.SeatArrangement;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer capacity;
    private SeatArrangement seatArrangement;
    @OneToMany
    @JoinTable(name = "cinema_hall_screenin",joinColumns = {@JoinColumn(name = "cinema_hall_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")})
    private List<Screening> screenings;

}
