package com.taya.production.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.taya.production.model.Foo;

@Repository
public class FooDaoImpl implements FooDao	{

	@Override
	public List<Foo> getAll() {
		// TODO Auto-generated method get all Foo list from database
		return null;
	}

	@Override
	public Foo findById(Long id) {
		// TODO Auto-generated method to find Foo id from Database
		return null;
	}

	@Override
	public List<Foo> getFoos(int start, int end) {
		// TODO Auto-generated method get Foos from database pagging
		return null;
	}

	@Override
	public Foo saveOrUpdate(Foo foo) {
		// TODO Auto-generated method save if create new Foo and update if exist.
		return null;
	}

	@Override
	public Boolean delete() {
		// TODO Auto-generated method delete Foo 
		return null;
	}

}
