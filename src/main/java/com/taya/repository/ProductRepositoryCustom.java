/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.ProductForm;
import com.taya.model.Product;

/**
 * @author ManNLM
 */
public interface ProductRepositoryCustom {

	public Product addOrUpdate(ProductForm productForm);

}
