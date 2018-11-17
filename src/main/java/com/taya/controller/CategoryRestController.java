/**
 * TAYAFOOD 2018
 */
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

import com.taya.form.CategoryForm;
import com.taya.model.Category;
import com.taya.reposotory.CategoryRepository;
import com.taya.reposotory.CategoryRepositoryCustom;

/**
 * @author ManNLM
 */
@RestController
@RequestMapping("/api")
public class CategoryRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryRepositoryCustom categoryRepositoryCustom;

	@RequestMapping("/category")
	@ResponseBody
	public List<Category> getCategory() {
		return categoryRepository.findAll();
	}
	
	@RequestMapping("/category/{categoryId}")
	@ResponseBody
	public Category getCategoryById(@PathVariable("categoryId") Long categoryId) {
		Category cate = null;
		try {
			cate = categoryRepository.findById(categoryId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return cate;
		}
		return cate;
	}
	
	@RequestMapping(value = "/category/updateCategory", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Category updateCategory(@RequestBody CategoryForm categoryForm) {
		return categoryRepositoryCustom.addOrUpdate(categoryForm);
	}
	
	@RequestMapping(value = "/category/delete/{categoryId}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
		categoryRepository.deleteById(categoryId);
	}
	
}
