package com.taya.model.production;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long productid;

	private String color;

	private Boolean finishgoodflags;

	private Boolean makeflag;

	private String productname;

	private String productnumber;

	private Integer safetystocklever;

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