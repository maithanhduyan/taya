/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.taya.form.OrderdetailForm;
import com.taya.model.Orderdetail;

/**
 * @author ManNLM
 */

public class OrderdetailRepositoryCustomImpl implements OrderdetailRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Orderdetail, Long> crud;

	@Override
	public Orderdetail addOrUpdate(OrderdetailForm orderDetailForm) {

		Orderdetail orderDetail = entityManager.find(Orderdetail.class, orderDetailForm.getOrderid());

		if (orderDetail == null) {
			orderDetail = new Orderdetail();
			orderDetail.setOrderid(orderDetailForm.getOrderid());
			orderDetail.setProductid(orderDetailForm.getProductid());
			orderDetail.setPrice(orderDetailForm.getPrice());
			orderDetail.setQuantity(orderDetailForm.getQuantity());
			crud.save(orderDetail);
			return orderDetail;
		} else {
			orderDetail.setOrderid(orderDetailForm.getOrderid());
			orderDetail.setProductid(orderDetailForm.getProductid());
			orderDetail.setPrice(orderDetailForm.getPrice());
			orderDetail.setQuantity(orderDetailForm.getQuantity());
			entityManager.flush();
		}
		return orderDetail;
	}
}
