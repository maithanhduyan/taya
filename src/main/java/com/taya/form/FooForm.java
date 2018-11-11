package com.taya.form;

/**
 * @author Mai Thành Duy An
 */
public class FooForm {
	Long fooId;
	String fooCode;
	String fooName;

	public Long getFooId() {
		return fooId;
	}

	public void setFooId(Long fooId) {
		this.fooId = fooId;
	}

	public String getFooCode() {
		return fooCode;
	}

	public void setFooCode(String fooCode) {
		this.fooCode = fooCode;
	}

	public String getFooName() {
		return fooName;
	}

	public void setFooName(String fooName) {
		this.fooName = fooName;
	}

	@Override
	public String toString() {
		return "{" + "fooId:" + fooId + ",fooCode:" + fooCode + ",fooName:" + fooName + "}";
	}
}
