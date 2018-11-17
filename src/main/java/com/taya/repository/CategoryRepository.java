/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Category;

/**
 * @author ManNLM
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{

	public List<Category> findAll();
}
