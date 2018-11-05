/**
 * TayaFood 2018
 */
package com.taya.product.service;

import org.springframework.data.repository.CrudRepository;
import com.taya.product.model.Product;

/**
 * @author Mai Thành Duy An
 */

public interface ProductService extends CrudRepository<Product, Long>, ProductServiceExtend {

}
