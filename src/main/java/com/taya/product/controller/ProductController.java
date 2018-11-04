/**
 * TayaFood 2018
 */
package com.taya.product.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.taya.product.model.Product;
import com.taya.product.model.ProductCategory;
import com.taya.utils.StringUtil;

/**
 * @author Mai Thành Duy An
 */

@RestController
@RequestMapping(StringUtil.API_PATH)
public class ProductController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductCategory productcategory;

	@Autowired
	private Product product;

	@RequestMapping("/Product/getAll")
	@ResponseBody
	public List<Product> getAll() {

		return null;
	}

}
