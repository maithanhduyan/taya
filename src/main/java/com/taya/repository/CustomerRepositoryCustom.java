/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.CustomerForm;
import com.taya.model.Customer;

/**
 * @author ManNLM
 */
public interface CustomerRepositoryCustom {

	public Customer addOrUpdate(CustomerForm customerForm);
}
