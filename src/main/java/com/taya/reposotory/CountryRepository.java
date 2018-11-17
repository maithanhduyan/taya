/**
 * TAYAFOOD 2018
 */
package com.taya.reposotory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Country;

/**
 * @author ManNLM
 */
public interface CountryRepository extends CrudRepository<Country, Long>{
	
	public List<Country> findAll();
	
}
