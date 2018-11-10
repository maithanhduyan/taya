/**
 * TAYAFOOD 2018
 */
package com.taya.dao.production;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taya.model.production.Foo;
import com.taya.model.production.FooForm;

/**
 * @author ManNLM
 */
@Repository
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
