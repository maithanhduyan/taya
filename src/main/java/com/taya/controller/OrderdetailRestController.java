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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.model.Orderdetail;
import com.taya.repository.OrderdetailRepository;
import com.taya.repository.OrderdetailRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class OrderdetailRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrderdetailRepository orderDetailRepository;

	@Autowired
	private OrderdetailRepositoryCustom orderDetailRepositoryCustom;

	@RequestMapping("/order-detail")
	@ResponseBody
	public List<Orderdetail> getOrderDetail() {
		return orderDetailRepository.findAll();
	}

	@RequestMapping("/order-detail/{orderDetailId}")
	@ResponseBody
	public Orderdetail getOrderDetailById(@PathVariable("orderDetailId") Long orderDetailId) {
		Orderdetail orderDetail = null;
		try {
			orderDetail = orderDetailRepository.findById(orderDetailId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return orderDetail;
		}
		return orderDetail;
	}

	@RequestMapping(value = "/order-detail/delete/{orderDetailId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteOrderDetail(@PathVariable("orderDetailId") Long orderDetailId) {
		orderDetailRepository.deleteById(orderDetailId);
	}
}
