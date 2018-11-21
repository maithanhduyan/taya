/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.User;

/**
 * @author ManNLM
 */
public interface UserRepository extends CrudRepository<User, Long> {

	public List<User> findAll();

}
