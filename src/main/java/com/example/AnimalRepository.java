package com.example;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jennifer on 2/17/17.
 */
@RepositoryRestResource
public interface AnimalRepository extends CrudRepository<Animal, Long> {
    @Query("select a from Animal a order by rand()")
    List<Animal> getAnimalsRandomOrder();
}
