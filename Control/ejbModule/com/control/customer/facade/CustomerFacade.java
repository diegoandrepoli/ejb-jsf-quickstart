package com.control.customer.facade;

import java.util.List;

import javax.ejb.Local;

import com.control.customer.entity.Customer;

/**
 * Customer facade
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
@Local
public interface CustomerFacade {
	
	/**
	 * Get all customers
	 * @return the list of customer
	 */
	public abstract List<Customer> getAll();
	
	/**
	 * Save the new customer
	 * @param customer
	 */
	public abstract void save(Customer customer);
	
	/**
	 * Update the customer
	 * @param customer
	 * @return the customer persist
	 */
	public abstract Customer update(Customer customer);
	
	/**
	 * Delete customer
	 * @param customer
	 */
	public abstract void delete(Customer customer);
}
