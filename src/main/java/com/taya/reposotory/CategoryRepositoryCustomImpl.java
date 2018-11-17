/**
 * TAYAFOOD 2018
 */
package com.taya.reposotory;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.model.Category;
import com.taya.model.Foo;

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
	public Category addOrUpdate(Category category) {
		
		Category cate = entityManager.find(Category.class, category.getCategoryid());
		
		if (cate == null) {
			cate = new Category();
			cate.setCategoryname(category.getCategoryname());
			cate.setDescription(category.getDescription());
			crud.save(cate);
			return cate;
		} else {
			cate.setCategoryname(category.getCategoryname());
			cate.setDescription(category.getDescription());
			entityManager.flush();
		}
		return cate;
	}

	
}
