/**
 * TayaFood 2018
 */
package com.taya.product.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.taya.product.model.ProductCategory;
import com.taya.product.model.ProductCategotyModel;

/**
 * @author Mai Thành Duy An
 */
public interface ProductCategotyRepository extends CrudRepository<ProductCategory, Long>, ProductCategotyModel {

	List<ProductCategory> findAll();

}
