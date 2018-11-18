/**
 * TAYAFOOD 2018
 */
package com.taya.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.form.ProductForm;
import com.taya.model.Product;
import com.taya.repository.ProductRepository;
import com.taya.repository.ProductRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class ProductRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductRepositoryCustom productRepositoryCustom;

	@RequestMapping("/product")
	@ResponseBody
	public List<Product> getProduct() {
		return productRepository.findAll();
	}

	@RequestMapping("/product/{productId}")
	@ResponseBody
	public Product getProductById(@PathVariable("productId") Long productId) {
		Product product = null;
		try {
			product = productRepository.findById(productId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return product;
		}
		return product;
	}

	@RequestMapping(value = "/product/update", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Product updateProduct(@RequestBody ProductForm productForm) {
		return productRepositoryCustom.addOrUpdate(productForm);
	}

	@RequestMapping(value = "/product/delete/{productId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteProduct(@PathVariable("productId") Long productId) {
		productRepository.deleteById(productId);
	}
}
