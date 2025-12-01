package com.example.shop;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Getter
@Setter
public class Item {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment
    public Long id;

    @Column(nullable = false,unique = true)
    private String title;
    private Integer price;




}
