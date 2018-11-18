/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Product;

/**
 * @author ManNLM
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

	public List<Product> findAll();

}
