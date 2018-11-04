package com.taya.model.production;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long countryid;

	private String a2;

	private String a3;

	@Column(name="active_")
	private Boolean active;

	@Column(name="idd_")
	private String idd;

	private String name;

	@Column(name="number_")
	private String number;

	private Boolean ziprequired;

	public Country() {
	}

	public Long getCountryid() {
		return this.countryid;
	}

	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}

	public String getA2() {
		return this.a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return this.a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getIdd() {
		return this.idd;
	}

	public void setIdd(String idd) {
		this.idd = idd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Boolean getZiprequired() {
		return this.ziprequired;
	}

	public void setZiprequired(Boolean ziprequired) {
		this.ziprequired = ziprequired;
	}

}