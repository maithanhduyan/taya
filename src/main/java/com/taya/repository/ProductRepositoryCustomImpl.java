/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.ProductForm;
import com.taya.model.Order;
import com.taya.model.Product;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Product, Long> crud;

	@Override
	public Product addOrUpdate(ProductForm productForm) {

		Product product = entityManager.find(Product.class, productForm.getProductid());

		if (product == null) {
			product = new Product();
			product.setColor(productForm.getColor());
			product.setFinishgoodflags(productForm.getFinishgoodflags());
			product.setMakeflag(productForm.getMakeflag());
			product.setProductcategoryid(productForm.getProductcategoryid());
			product.setProductcode(productForm.getProductcode());
			product.setProductname(productForm.getProductname());
			product.setProductnumber(productForm.getProductnumber());
			product.setProductuuid(productForm.getProductuuid());
			product.setSafetystocklever(productForm.getSafetystocklever());
			product.setStandardcost(productForm.getStandardcost());
			crud.save(product);
			return product;
		} else {
			product.setColor(productForm.getColor());
			product.setFinishgoodflags(productForm.getFinishgoodflags());
			product.setMakeflag(productForm.getMakeflag());
			product.setProductcategoryid(productForm.getProductcategoryid());
			product.setProductcode(productForm.getProductcode());
			product.setProductname(productForm.getProductname());
			product.setProductnumber(productForm.getProductnumber());
			product.setProductuuid(productForm.getProductuuid());
			product.setSafetystocklever(productForm.getSafetystocklever());
			product.setStandardcost(productForm.getStandardcost());
			entityManager.flush();
		}
		return product;
	}
}
