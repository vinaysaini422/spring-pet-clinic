package com.saini.spring.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saini.spring.pet.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
