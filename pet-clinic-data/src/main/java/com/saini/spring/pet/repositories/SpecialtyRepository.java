package com.saini.spring.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saini.spring.pet.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
