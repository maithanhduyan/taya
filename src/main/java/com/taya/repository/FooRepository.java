/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Foo;

/**
 * @author AnMTD
 */

public interface FooRepository extends CrudRepository<Foo, Long> {

	List<Foo> findAll();

}
