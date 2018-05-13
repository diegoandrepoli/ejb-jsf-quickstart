package com.control.customer.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer entity model object
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
@Entity
@Table(name="customers")
public class Customer implements Serializable {

	/**
	 * Default serial version
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Customer identifier, auto generate value
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * Customer name
	 */
	private String name;
	
	/**
	 * Customer email
	 */
	private String email;

	/**
	 * Get customer identification
	 * @return the customer identification
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Set customer identification
	 * @param the customer identification
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Get customer name
	 * @return the customer name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ser customer name
	 * @param the customer name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get customer email
	 * @return the customer email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Ser customer email
	 * @param the customer email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
