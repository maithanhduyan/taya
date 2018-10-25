package com.taya.production.repository;

import java.util.List;

import com.taya.production.model.Foo;

public interface FooRepository {

	Foo findFooById(Long id); 
	
	List<Foo> getAll();
}
