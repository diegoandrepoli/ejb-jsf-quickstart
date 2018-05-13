package com.control.customer.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.control.customer.dao.CustomerDAO;
import com.control.customer.entity.Customer;

/**
 * Customer facade implmentation
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
@Stateless
public class CustomerFacadeImpl implements CustomerFacade {

	/**
	 * Customer data access object
	 */
	@EJB
	private CustomerDAO customerDAO;
	
	/**
	 * Get all customers
	 */
	@Override
	public List<Customer> getAll() {
		return customerDAO.getAll();
	}

	/**
	 * Save the customer
	 */
	@Override
	public void save(Customer customer) {
		customerDAO.save(customer);
	}

	/**
	 * Update customer
	 */
	@Override
	public Customer update(Customer customer) {
		return customerDAO.update(customer);
	}

	/**
	 * Delete customer
	 */
	@Override
	public void delete(Customer customer) {
		customerDAO.delete(customer);
	}
}
