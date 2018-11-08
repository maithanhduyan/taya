/**
 * TayaFood 2018
 */
package com.taya.product.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Mai Thành Duy An
 */
public class ProductCategoryModelImpl extends ProductCategory implements ProductCategotyModel {

	private static final long serialVersionUID = 1L;

	private ProductModel product;

	@Override
	public List<ProductCategory> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = null;
		try {
			products = product.findByCategoriId(this.getCategoryid());
			return products;
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}

	Logger log = LoggerFactory.getLogger(this.getClass());
}
