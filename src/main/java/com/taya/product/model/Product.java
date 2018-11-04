package com.taya.product.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productid;

	private String color;

	@ManyToOne
	@JoinColumn(name = "categoryid", nullable = false)
	private Long productcategoryid;

	private String productname;

	private String productuuid;

	private Integer standardcost;

	public Product() {
	}

	public Long getProductid() {
		return this.productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getProductcategoryid() {
		return this.productcategoryid;
	}

	public void setProductcategoryid(Long productcategoryid) {
		this.productcategoryid = productcategoryid;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductuuid() {
		return this.productuuid;
	}

	public void setProductuuid(String productuuid) {
		this.productuuid = productuuid;
	}

	public Integer getStandardcost() {
		return this.standardcost;
	}

	public void setStandardcost(Integer standardcost) {
		this.standardcost = standardcost;
	}

}