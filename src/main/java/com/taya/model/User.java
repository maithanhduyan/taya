package com.taya.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long userid;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date createdate;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	private String firstname;

	private String lastname;

	@Temporal(TemporalType.DATE)
	private Date modifieddate;

	private String password;

	private String phone;

	private String useruuid;

	public User() {
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUseruuid() {
		return this.useruuid;
	}

	public void setUseruuid(String useruuid) {
		this.useruuid = useruuid;
	}

}