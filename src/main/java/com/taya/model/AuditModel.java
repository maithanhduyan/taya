/**
 * TayaFood 2018
 */
package com.taya.model;

import java.util.Date;

/**
 * @author Mai Thành Duy An
 */
public interface AuditModel {

	public Date getCreateDate();

	public Date getModifiedDate();

	public long getUserId();

	public String getUserName();

	public String getUserUuid();

	public void setCreateDate(Date date);

	public void setModifiedDate(Date date);

	public void setUserId(long userId);

	public void setUserName(String userName);

	public void setUserUuid(String userUuid);
	
}
