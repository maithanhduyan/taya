package com.taya.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the image database table.
 * 
 */
@Entity
@NamedQuery(name="Image.findAll", query="SELECT i FROM Image i")
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long imageid;

	private byte[] imagedata;

	private String imagename;

	private Long productid;

	public Image() {
	}

	public Long getImageid() {
		return this.imageid;
	}

	public void setImageid(Long imageid) {
		this.imageid = imageid;
	}

	public byte[] getImagedata() {
		return this.imagedata;
	}

	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}

	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public Long getProductid() {
		return this.productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

}