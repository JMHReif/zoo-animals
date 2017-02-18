package com.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jennifer on 2/17/17.
 */
@Data
@NoArgsConstructor
@Entity
public class Animal {
    @Id
    @GeneratedValue
    private Long id;
    private String animal;
    private String name;

    public Animal(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }
}
