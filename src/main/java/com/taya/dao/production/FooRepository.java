/**
 * TAYAFOOD 2018
 */
package com.taya.dao.production;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.production.Foo;

/**
 * @author ManNLM
 */
public interface FooRepository extends CrudRepository<Foo, Long>, FooRepositoryCustom {

	List<Foo> findAll();

}
