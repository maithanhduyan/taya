/**
 * TAYAFOOD 2018
 */
package com.taya.reposotory;

import com.taya.form.CategoryForm;
import com.taya.model.Category;

/**
 * @author ManNLM
 */
public interface CategoryRepositoryCustom {

	public Category addOrUpdate(CategoryForm categoryForm);
	
}
