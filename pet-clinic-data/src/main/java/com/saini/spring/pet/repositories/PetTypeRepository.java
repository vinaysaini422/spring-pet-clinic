package com.saini.spring.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saini.spring.pet.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
