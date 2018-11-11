/**
 * TayaFood 2018
 */
package com.taya.banking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mai Thành Duy An
 *
 */
@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

	@RequestMapping("/begin/{verifyAccount}")
	public Boolean verifyAcount() {
		return true;
	}
}
