package com.example.cinema.entity;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull(message = "Title cannot be null")
    @Size(min = 5, max = 20, message = "Title must be between 5 and 20 characters")
    private String title;
    @NotNull(message = "Date cannot be null")
    private LocalDate date;
    @NotNull(message = "Genre cannot be null")
    @Size(min = 20, max = 120, message = "Genre must be between 20 and 120 characters")
    private String genre;
    @NotNull(message = "Duration cannot be null")
    private String duration;
    @OneToMany
    @JoinTable(name = "movie_screening",joinColumns = {@JoinColumn(name = "movie_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")})
    private List<Screening> screenings;


}
