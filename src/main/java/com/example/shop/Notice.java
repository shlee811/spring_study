package com.example.shop;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment
    public Long id;

    @Column(nullable = false, unique = true)
    public String title;
    private LocalDate date;

}