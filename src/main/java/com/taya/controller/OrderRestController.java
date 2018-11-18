/**
 * TAYAFOOD 2018
 */
package com.taya.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.form.OrderForm;
import com.taya.model.Image;
import com.taya.model.Order;
import com.taya.repository.OrderRepository;
import com.taya.repository.OrderRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class OrderRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderRepositoryCustom orderRepositoryCustom;

	@RequestMapping("/order")
	@ResponseBody
	public List<Order> getOrder() {
		return orderRepository.findAll();
	}

	@RequestMapping("/order/{orderId}")
	@ResponseBody
	public Order getCategoryById(@PathVariable("orderId") Long orderId) {
		Order order = null;
		try {
			order = orderRepository.findById(orderId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return order;
		}
		return order;
	}

	@RequestMapping(value = "/order/update", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Order updateCategory(@RequestBody OrderForm orderForm) {
		return orderRepositoryCustom.addOrUpdate(orderForm);
	}

	@RequestMapping(value = "/order/delete/{orderId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteOrder(@PathVariable("orderId") Long orderId) {
		orderRepository.deleteById(orderId);
	}
}
