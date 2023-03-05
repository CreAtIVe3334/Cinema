package com.example.cinema.entity;


import jakarta.persistence.*;
import lombok.*;

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
    private String title;
    private LocalDate date;
    private String genre;
    private String duration;
    @OneToMany
    @JoinTable(name = "movie_screenin",joinColumns = {@JoinColumn(name = "movie_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")})
    private List<Screening> screenings;


}
