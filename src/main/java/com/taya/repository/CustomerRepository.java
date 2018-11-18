/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Customer;

/**
 * @author ManNLM
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	public List<Customer> findAll();

}
