/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Image;

/**
 * @author ManNLM
 */
public interface ImageRepository extends CrudRepository<Image, Long> {

	public List<Image> findAll();

}
