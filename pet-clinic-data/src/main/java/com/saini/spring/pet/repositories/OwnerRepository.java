package com.saini.spring.pet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saini.spring.pet.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
