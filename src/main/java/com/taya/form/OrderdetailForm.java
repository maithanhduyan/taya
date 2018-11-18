package com.taya.form;

import java.math.BigDecimal;

/**
 * @author ManNLM
 * 
 */

public class OrderdetailForm {

	Long orderdetailsid;

	Long orderid;

	BigDecimal price;

	Long productid;

	Integer quantity;

	public Long getOrderdetailsid() {
		return this.orderdetailsid;
	}

	public void setOrderdetailsid(Long orderdetailsid) {
		this.orderdetailsid = orderdetailsid;
	}

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getProductid() {
		return this.productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}