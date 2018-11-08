/**
 * TayaFood 2018
 */
package com.taya.product.model;

import java.util.List;

/**
 * @author Mai Thành Duy An
 */

public interface ProductModel {

	public List<Product> getAll();
	
	public List<Product> findByCategoriId(Long id);

	public Product findById(Long id);
	
	public Product findByName(String name);
	
	public Product delete(Long id);
	
	public Product update(Product product);
	
	public Product create();
	
}
