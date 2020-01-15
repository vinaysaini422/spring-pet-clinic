package com.saini.spring.pet.model;

import java.io.Serializable;


public class BaseEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4772967332271101316L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
