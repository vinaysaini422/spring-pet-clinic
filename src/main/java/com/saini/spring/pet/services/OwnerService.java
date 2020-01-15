package com.saini.spring.pet.services;

import com.saini.spring.pet.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
}
