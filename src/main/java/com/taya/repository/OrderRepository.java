/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Order;

/**
 * @author ManNLM
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

	public List<Order> findAll();

}
