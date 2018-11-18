/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.OrderForm;
import com.taya.model.Order;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Order, Long> crud;

	@Override
	public Order addOrUpdate(OrderForm orderForm) {

		Order order = entityManager.find(Order.class, orderForm.getOrderid());

		if (order == null) {
			order = new Order();
			order.setCustomerid(orderForm.getCustomerid());
			order.setOrderdate(orderForm.getOrderdate());
			order.setDescription(orderForm.getDescription());
			order.setOrderuuid(orderForm.getOrderuuid());
			crud.save(order);
			return order;
		} else {
			order.setCustomerid(orderForm.getCustomerid());
			order.setOrderdate(orderForm.getOrderdate());
			order.setDescription(orderForm.getDescription());
			order.setOrderuuid(orderForm.getOrderuuid());
			entityManager.flush();
		}
		return order;
	}
}
