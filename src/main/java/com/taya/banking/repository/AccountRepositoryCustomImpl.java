/**
 * TayaFood 2018
 */
package com.taya.banking.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.taya.banking.model.Account;

/**
 * @author Mai Thành Duy An
 *
 */
@Transactional
public class AccountRepositoryCustomImpl implements AccountRepositoryCustom {

	@PersistenceContext
	EntityManager EntityManager;

	@Override
	public Account findByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
