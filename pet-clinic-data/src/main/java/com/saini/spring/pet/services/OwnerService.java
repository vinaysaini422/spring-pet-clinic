package com.saini.spring.pet.services;

import java.util.Set;

import com.saini.spring.pet.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
