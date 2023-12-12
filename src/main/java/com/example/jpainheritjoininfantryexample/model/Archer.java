package com.example.jpainheritjoininfantryexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARCHER")
public class Archer extends Infantry {
    private Integer range;

    public Archer() {
    }

    public Archer(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
        super(type, moveSpeed, durability, attack);
        this.range = range;
    }
}