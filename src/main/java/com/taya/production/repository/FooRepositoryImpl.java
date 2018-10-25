package com.taya.production.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.taya.production.dao.FooDao;
import com.taya.production.model.Foo;

@Repository
public class FooRepositoryImpl implements FooRepository {
	
	@Autowired
	FooDao fooDao;

	@Override
	public Foo findFooById(Long id) {
		return null;
	}

	@Override
	public List<Foo> getAll() {
		return null;
	}

}
