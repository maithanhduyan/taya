package com.taya.form;

/**
 * @author ManNLM
 * 
 */

public class ProductForm {

	Long productid;

	String color;

	Boolean finishgoodflags;

	Boolean makeflag;

	Long productcategoryid;

	String productcode;

	String productname;

	String productnumber;

	String productuuid;

	Integer safetystocklever;

	Integer standardcost;

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

	public Boolean getFinishgoodflags() {
		return this.finishgoodflags;
	}

	public void setFinishgoodflags(Boolean finishgoodflags) {
		this.finishgoodflags = finishgoodflags;
	}

	public Boolean getMakeflag() {
		return this.makeflag;
	}

	public void setMakeflag(Boolean makeflag) {
		this.makeflag = makeflag;
	}

	public Long getProductcategoryid() {
		return this.productcategoryid;
	}

	public void setProductcategoryid(Long productcategoryid) {
		this.productcategoryid = productcategoryid;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductnumber() {
		return this.productnumber;
	}

	public void setProductnumber(String productnumber) {
		this.productnumber = productnumber;
	}

	public String getProductuuid() {
		return this.productuuid;
	}

	public void setProductuuid(String productuuid) {
		this.productuuid = productuuid;
	}

	public Integer getSafetystocklever() {
		return this.safetystocklever;
	}

	public void setSafetystocklever(Integer safetystocklever) {
		this.safetystocklever = safetystocklever;
	}

	public Integer getStandardcost() {
		return this.standardcost;
	}

	public void setStandardcost(Integer standardcost) {
		this.standardcost = standardcost;
	}

}