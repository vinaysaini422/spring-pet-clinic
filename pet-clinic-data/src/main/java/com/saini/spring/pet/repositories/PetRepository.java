package com.saini.spring.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saini.spring.pet.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
