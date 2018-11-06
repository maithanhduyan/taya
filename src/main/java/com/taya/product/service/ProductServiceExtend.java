/**
 * TayaFood 2018
 */
package com.taya.product.service;

import java.util.List;

import com.taya.product.model.Product;

/**
 * @author Mai Thành Duy An
 */
public interface ProductServiceExtend {

	public Product addProduct(long id, String color, long productCategoryId, String productName, String productUUID,
			Integer standardCost) throws Exception;

	public Product updateProduct(long id, String color, long productCategoryId, String productName, String productUUID,
			Integer standardCost) throws Exception;

	public Product delete(long id) throws Exception;

	public Product finfById(long id);
	
	//@Query("SELECT p FROM Product WHERE p.productname = :productName")
	List<Product> findByName(String productName);

}
