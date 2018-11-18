/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.OrderdetailForm;
import com.taya.model.Orderdetail;

/**
 * @author ManNLM
 */
public interface OrderdetailRepositoryCustom {

	public Orderdetail addOrUpdate(OrderdetailForm orderDetailForm);

}
