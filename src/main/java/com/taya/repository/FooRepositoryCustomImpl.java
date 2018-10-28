/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.model.Foo;
import com.taya.model.FooForm;

/**
 * @author AnMTD
 */

@Repository
@Transactional
public class FooRepositoryCustomImpl implements FooRepositoryCustom {

	@Autowired
	EntityManager entityManager;
	
	@Autowired
	CrudRepository<Foo, Long> crud;

	@Override
	public Foo addOrUpdateFoo(FooForm fooForm) {
		Foo foo = entityManager.find(Foo.class, fooForm.getFooId());
		if (foo == null) {
			foo = new Foo();
			foo.setFoocode(fooForm.getFooCode());
			foo.setFooname(fooForm.getFooName());
			foo.setCreatedate(new Date());
			crud.save(foo);
			return foo;
		} else {
			foo.setFoocode(fooForm.getFooCode());
			foo.setFooname(fooForm.getFooName());
			foo.setCreatedate(new Date());
			entityManager.flush();
		}
		return foo;
	}

}
