/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Region;

/**
 * @author ManNLM
 */
public interface RegionRepository extends CrudRepository<Region, Long> {

	public List<Region> findAll();

}
