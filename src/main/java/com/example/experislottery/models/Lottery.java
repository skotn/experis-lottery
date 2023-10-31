package com.example.experislottery.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Lottery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Lottery(String name) {
        this.name= name;
    }

    public Lottery() {

    }

    public String getName(){
        return this.name;
    }

    public Long getId(){
        return this.id;
    }
}
