package com.saini.spring.pet.services;

import java.util.Set;

import com.saini.spring.pet.model.Pet;


public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
