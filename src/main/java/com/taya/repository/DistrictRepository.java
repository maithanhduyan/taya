/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.District;

/**
 * @author ManNLM
 */
public interface DistrictRepository extends CrudRepository<District, Long> {

	public List<District> findAll();
	
}
