/**
 * TayaFood 2018
 */
package com.taya.product.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.taya.product.model.ProductCategory;

/**
 * @author Mai Thành Duy An
 */
public interface ProductCategotyRepository extends CrudRepository<ProductCategory, Long> {

	List<ProductCategory> findAll();

}
