package com.taya.production.service;

import java.util.List;
import com.taya.production.model.Foo;

public interface FooService {

	List<Foo> getAll();

	Foo findFooById(Long id);
	
}
