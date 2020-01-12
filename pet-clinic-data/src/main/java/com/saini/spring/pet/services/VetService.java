package com.saini.spring.pet.services;

import java.util.Set;

import com.saini.spring.pet.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
