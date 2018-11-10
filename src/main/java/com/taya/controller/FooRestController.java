package com.taya.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.model.Foo;
import com.taya.model.FooForm;
import com.taya.reposotory.FooRepository;
import com.taya.reposotory.FooRepositoryCustom;

/**
 * @author Mai Thành Duy An
 */
@RestController
@RequestMapping("/api")
public class FooRestController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FooRepository fooRepository;

	@Autowired
	private FooRepositoryCustom fooRepositoryCustom;

	@RequestMapping("/Foos")
	@ResponseBody
	public List<Foo> getFoos() {
		return fooRepository.findAll();
	}

	@RequestMapping("/Foo/{fooId}")
	@ResponseBody
	public Foo getFoo(@PathVariable("fooId") Long fooId) {
		Foo foo = null;
		try {
			foo = fooRepository.findById(fooId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return foo;
		}
		return foo;
	}

	@RequestMapping(value = "/Foo/updateFoo", //
			method = RequestMethod.POST, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Foo updateFoo(@RequestBody FooForm fooForm) {
		return fooRepositoryCustom.addOrUpdate(fooForm);
	}
	
	@RequestMapping(value = "/Foo/delete/{fooId}", //
			method = RequestMethod.DELETE, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteFoo(@PathVariable("fooId") Long fooId) {
		System.out.println("Delete fooId: " + fooId);
		fooRepository.deleteById(fooId);
	}
}
