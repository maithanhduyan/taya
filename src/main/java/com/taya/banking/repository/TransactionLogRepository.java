/**
 * TayaFood 2018
 */
package com.taya.banking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.taya.banking.model.Transactionlog;

/**
 * @author Mai Thành Duy An
 *
 */
@Repository
public interface TransactionLogRepository extends CrudRepository<Transactionlog, Long> {

}
