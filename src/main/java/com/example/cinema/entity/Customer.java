package com.example.cinema.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String paymentInformation;
    @OneToMany
    @JoinTable(name = "costumer_ticket",joinColumns = {@JoinColumn(name = "customer_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "ticket_id",referencedColumnName = "id")})
    private List<Ticket> tickets;

}
