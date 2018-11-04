package com.taya.product.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productcategory database table.
 * 
 */
@Entity
@NamedQuery(name="Productcategory.findAll", query="SELECT p FROM Productcategory p")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryid;

	private String categoryname;

	private String description;

	public ProductCategory() {
	}

	public Long getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}