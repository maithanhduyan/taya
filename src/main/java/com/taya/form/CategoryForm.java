/**
 * TAYAFOOD 2018
 */
package com.taya.form;

/**
 * @author ManNLM
 */
public class CategoryForm {
	
	Long categoryid;

	String categoryname;

	String description;

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
