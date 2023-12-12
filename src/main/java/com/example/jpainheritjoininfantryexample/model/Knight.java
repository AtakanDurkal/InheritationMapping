package com.example.jpainheritjoininfantryexample.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="KNIGHT")
public class Knight extends Infantry {
    private Boolean shield;

    public Knight() {
    }

    public Knight(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Boolean shield) {
        super(type, moveSpeed, durability, attack);
        this.shield = shield;
    }
}