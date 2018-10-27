package com.taya.production.dao;

import java.util.List;

import com.taya.production.model.Foo;

public interface FooDao{
	
	public List<Foo> getAll();
	
	public List<Foo> getFoos(int start, int end);
	
	public Foo findById(Long id);
	
	public Foo saveOrUpdate(Foo foo);
	
	public Boolean delete();
		
}
