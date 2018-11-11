package com.taya.banking.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the transactionlog database table.
 * 
 */
@Entity
@NamedQuery(name="Transactionlog.findAll", query="SELECT t FROM Transactionlog t")
public class Transactionlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long transid;

	private Long accountreceiveid;

	private Long accountsendid;

	private Timestamp actiontime;

	private double amount;

	public Transactionlog() {
	}

	public Long getTransid() {
		return this.transid;
	}

	public void setTransid(Long transid) {
		this.transid = transid;
	}

	public Long getAccountreceiveid() {
		return this.accountreceiveid;
	}

	public void setAccountreceiveid(Long accountreceiveid) {
		this.accountreceiveid = accountreceiveid;
	}

	public Long getAccountsendid() {
		return this.accountsendid;
	}

	public void setAccountsendid(Long accountsendid) {
		this.accountsendid = accountsendid;
	}

	public Timestamp getActiontime() {
		return this.actiontime;
	}

	public void setActiontime(Timestamp actiontime) {
		this.actiontime = actiontime;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}