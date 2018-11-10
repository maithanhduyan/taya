package com.taya.model.production;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the foo database table.
 * 
 */
@Entity
@NamedQuery(name="Foo.findAll", query="SELECT f FROM Foo f")
public class Foo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long fooid;

	@Temporal(TemporalType.DATE)
	private Date createdate;

	private String foocode;

	private String fooname;

	private Long usercreateid;

	private String username;

	public Foo() {
	}

	public Long getFooid() {
		return this.fooid;
	}

	public void setFooid(Long fooid) {
		this.fooid = fooid;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getFoocode() {
		return this.foocode;
	}

	public void setFoocode(String foocode) {
		this.foocode = foocode;
	}

	public String getFooname() {
		return this.fooname;
	}

	public void setFooname(String fooname) {
		this.fooname = fooname;
	}

	public Long getUsercreateid() {
		return this.usercreateid;
	}

	public void setUsercreateid(Long usercreateid) {
		this.usercreateid = usercreateid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}