/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.OrderForm;
import com.taya.model.Order;

/**
 * @author ManNLM
 */
public interface OrderRepositoryCustom {

	public Order addOrUpdate(OrderForm orderForm);

}
