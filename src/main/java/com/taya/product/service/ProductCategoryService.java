/**
 * TayaFood 2018
 */
package com.taya.product.service;

import java.util.List;

import javax.transaction.SystemException;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.taya.product.model.ProductCategory;

/**
 * @author Mai Thành Duy An
 */
@Transactional(isolation = Isolation.DEFAULT, rollbackFor = { Exception.class, SystemException.class })
public interface ProductCategoryService {

	public List<ProductCategory> getAll();
}
