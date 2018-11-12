/**
 * TayaFood 2018
 */
package com.taya.banking.repository;

import com.taya.banking.model.Account;

/**
 * @author Mai Thành Duy An
 *
 */
public interface AccountRepositoryCustom {
	
	public Account findByPrimaryKey(Long id);

}
