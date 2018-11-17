/**
 * TAYAFOOD 2018
 */
package com.taya.reposotory;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.CategoryForm;
import com.taya.model.Category;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class CategoryRepositoryCustomImpl implements CategoryRepositoryCustom{
	
	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Category, Long> crud;
	
	@Override
	public Category addOrUpdate(CategoryForm categoryForm) {
		
		Category cate = entityManager.find(Category.class, categoryForm.getCategoryid());
		
		if (cate == null) {
			cate = new Category();
			cate.setCategoryname(categoryForm.getCategoryname());
			cate.setDescription(categoryForm.getDescription());
			crud.save(cate);
			return cate;
		} else {
			cate.setCategoryname(categoryForm.getCategoryname());
			cate.setDescription(categoryForm.getDescription());
			entityManager.flush();
		}
		return cate;
	}

}
