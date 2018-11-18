package com.taya.form;

/**
 * @author ManNLM
 * 
 */

public class RegionForm {

	Long regionid;

	Boolean active;

	Long countryid;

	String name;

	String regioncode;

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