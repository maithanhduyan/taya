package com.taya.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the district database table.
 * 
 */
@Entity
@NamedQuery(name="District.findAll", query="SELECT d FROM District d")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long districtid;

	private Boolean active;

	private String districtcode;

	private String name;

	private Long regionid;

	public District() {
	}

	public Long getDistrictid() {
		return this.districtid;
	}

	public void setDistrictid(Long districtid) {
		this.districtid = districtid;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getDistrictcode() {
		return this.districtcode;
	}

	public void setDistrictcode(String districtcode) {
		this.districtcode = districtcode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRegionid() {
		return this.regionid;
	}

	public void setRegionid(Long regionid) {
		this.regionid = regionid;
	}

}