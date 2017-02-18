package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jennifer on 2/17/17.
 */
@RestController
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/random")
    public Animal getRandomAnimal() {
        return this.animalRepository.getAnimalsRandomOrder().get(0);
    }
}
