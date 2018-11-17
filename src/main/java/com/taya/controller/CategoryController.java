/**
 * TAYAFOOD 2018
 */
package com.taya.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.model.Category;
import com.taya.reposotory.CategoryRepository;
import com.taya.reposotory.CategoryRepositoryCustom;

/**
 * @author ManNLM
 */
@RestController
@RequestMapping("/api")
public class CategoryController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryRepositoryCustom categoryRepositoryCustom;
	
	@RequestMapping("/category")
	@ResponseBody
	public List<Category> getCategory(){
		return categoryRepository.findAll();
	}
	

}
