/**
 * TayaFood 2018
 */
package com.taya.banking.repository;

import org.springframework.data.repository.CrudRepository;
import com.taya.banking.model.Transactionlog;

/**
 * @author Mai Thành Duy An
 *
 */
public interface TransactionLogRepository extends CrudRepository<Transactionlog, Long> {

}
