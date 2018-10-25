package com.taya.production.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taya.production.model.Foo;
import com.taya.production.repository.FooRepository;

@Service
public class FooServiceImpl implements FooService{
	
	@Autowired
	FooRepository fooRepository;

	@Override
	public List<Foo> getAll() {
		return fooRepository.getAll();
	}

	@Override
	public Foo findFooById(Long id) {
		return fooRepository.findFooById(id);
	}

}
