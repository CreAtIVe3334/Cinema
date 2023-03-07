package com.example.cinema.entity;

import com.example.cinema.enums.SeatArrangement;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotNull(message = "Name cannot be null")
    @Size(min = 5, max = 20, message = "Name must be between 5 and 20 characters")
    private String name;
    @NotNull(message = "Capacity cannot be null")
    @Max(value = 150, message = "capacity should not be greater than 150")
    private Integer capacity;
    @NotNull(message = "Seat Arrangement cannot be null")
    private SeatArrangement seatArrangement;
    @OneToMany
    @JoinTable(name = "cinema_hall_screening",joinColumns = {@JoinColumn(name = "cinema_hall_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")})
    private List<Screening> screenings;

}
