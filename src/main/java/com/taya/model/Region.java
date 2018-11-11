package com.taya.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the region database table.
 * 
 */
@Entity
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long regionid;

	@Column(name="active_")
	private Boolean active;

	private Long countryid;

	private String name;

	private String regioncode;

	public Region() {
	}

	public Long getRegionid() {
		return this.regionid;
	}

	public void setRegionid(Long regionid) {
		this.regionid = regionid;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getCountryid() {
		return this.countryid;
	}

	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegioncode() {
		return this.regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

}