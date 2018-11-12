package com.taya.banking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
public class Account extends AccountModel implements Serializable {
	private static final long serialVersionUID = 1L;

	public Account() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accountid")
	private Long accountid;

	@Column(name = "balance")
	private double balance;

	@Column(name = "fullname")
	private String fullname;

	public Long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String createJSONObject() {
		StringBuilder str = new StringBuilder();
		str.append("{");
		str.append("accountId:");
		str.append(this.getAccountid());
		str.append(", fullName:");
		str.append(this.getFullname());
		str.append(", balance:");
		str.append(this.getBalance());
		str.append(", createDate:");
		str.append(this.getCreatedDate());
		str.append(", modifiedDate:");
		str.append(this.getModifiedDate());
		str.append("}");
		return str.toString();
	}
}