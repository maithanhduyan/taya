/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.CustomerForm;
import com.taya.model.Customer;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class CustomerRepositoryCustomImpl implements CustomerRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Customer, Long> crud;

	@Override
	public Customer addOrUpdate(CustomerForm customerForm) {

		Customer customer = entityManager.find(Customer.class, customerForm.getCustomerid());

		if (customer == null) {
			customer = new Customer();
			customer.setFirstname(customerForm.getFirstname());
			customer.setLastname(customerForm.getLastname());
			customer.setEmail(customerForm.getEmail());
			customer.setPassword(customerForm.getPassword());
			customer.setDob(customerForm.getDob());
			customer.setAddress(customerForm.getAddress());
			crud.save(customer);
			return customer;

		} else {
			customer.setFirstname(customerForm.getFirstname());
			customer.setLastname(customerForm.getLastname());
			customer.setEmail(customerForm.getEmail());
			customer.setPassword(customerForm.getPassword());
			customer.setDob(customerForm.getDob());
			customer.setAddress(customerForm.getAddress());
			entityManager.flush();
		}
		return customer;
	}

}
