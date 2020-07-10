package com.saini.spring.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saini.spring.pet.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
