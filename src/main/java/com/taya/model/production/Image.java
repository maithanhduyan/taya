package com.taya.model.production;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long imageid;

	private byte[] imagedata;

	private String imagename;

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

}