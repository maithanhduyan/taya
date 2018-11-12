package com.taya.banking.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the transactionlog database table.
 * 
 */
@Entity
@NamedQuery(name = "Transactionlog.findAll", query = "SELECT t FROM Transactionlog t")
public class Transactionlog extends TransactionLogModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transactionid")
	private Long transactionId;

	@Column(name = "accountreceiveid", nullable = false)
	private Long accountReceiveId;

	@Column(name = "accountsendid", nullable = false)
	private Long accountSendId;

	private Timestamp actiontime;

	@Column(name = "amount", nullable = false)
	private double amount;

	public Transactionlog() {
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getAccountReceiveId() {
		return accountReceiveId;
	}

	public void setAccountReceiveId(Long accountReceiveId) {
		this.accountReceiveId = accountReceiveId;
	}

	public Long getAccountSendId() {
		return accountSendId;
	}

	public void setAccountSendId(Long accountSendId) {
		this.accountSendId = accountSendId;
	}

	public Timestamp getActiontime() {
		return actiontime;
	}

	public void setActiontime(Timestamp actiontime) {
		this.actiontime = actiontime;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}