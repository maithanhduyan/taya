/**
 * TayaFood 2018
 */
package com.taya.product.service;

import java.util.List;

import javax.transaction.SystemException;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.taya.product.model.Product;

/**
 * @author Mai Thành Duy An
 */

@Repository
@Service
@Transactional(isolation = Isolation.DEFAULT, rollbackFor = { Exception.class, SystemException.class })
public class ProductServiceImpl implements ProductServiceExtend {

	@Override
	public Product addProduct(long id, String color, long productCategoryId, String productName, String productUUID,
			Integer standardCost) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(long id, String color, long productCategoryId, String productName, String productUUID,
			Integer standardCost) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product delete(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product finfById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

}
