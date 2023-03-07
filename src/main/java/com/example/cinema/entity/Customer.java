package com.example.cinema.entity;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.*;
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
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;
    @Email(message = "Email should be valid")
    private String email;
    @Min(value = 13, message = "Phone number should not be less than 18")
    @Max(value = 13, message = "Phone number should not be greater than 150")
    private String phoneNumber;
    @NotNull(message = "Payment Information cannot be null")
    private String paymentInformation;
    @OneToMany
    @JoinTable(name = "customer_ticket",joinColumns = {@JoinColumn(name = "customer_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "ticket_id",referencedColumnName = "id")})
    private List<Ticket> tickets;

}
