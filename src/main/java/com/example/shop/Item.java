package com.example.shop;


import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Item {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment
    public Long id;

    @Column(nullable = false,unique = true)
    public String title;
    public Integer price;




}
