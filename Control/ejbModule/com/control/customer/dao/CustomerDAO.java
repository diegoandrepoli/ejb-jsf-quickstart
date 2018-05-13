package com.control.customer.dao;

import javax.ejb.Stateless;

import com.control.customer.entity.Customer;
import com.control.generic.dao.GenericDAO;

/**
 * Customer data access object
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 */
@Stateless
public class CustomerDAO extends GenericDAO<Customer>{

	/**
	 * Default constructor
	 */
	public CustomerDAO() {
		super(Customer.class);
	}

}
