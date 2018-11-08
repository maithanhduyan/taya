/**
 * TayaFood 2018
 */
package com.taya.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.taya.product.model.Product;

/**
 * @author Mai Thành Duy An
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
