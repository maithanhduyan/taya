package com.taya.production.dao;

import java.util.List;

import com.taya.production.model.Foo;

public interface FooDao{
	
	public List<Foo> getAll();
	
	public Foo findById(Long id);
		
}
