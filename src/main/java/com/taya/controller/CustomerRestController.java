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

import com.taya.form.CustomerForm;
import com.taya.model.Customer;
import com.taya.repository.CustomerRepository;
import com.taya.repository.CustomerRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerRepositoryCustom customerRepositoryCustom;

	@RequestMapping("/customer")
	@ResponseBody
	public List<Customer> getCustomer() {
		return customerRepository.findAll();
	}

	@RequestMapping("/customer/{customerId}")
	@ResponseBody
	public Customer getCustomerById(@PathVariable("customerId") Long customerId) {
		Customer customer = null;
		try {
			customer = customerRepository.findById(customerId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return customer;
		}
		return customer;
	}

	@RequestMapping(value = "/customer/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Customer updateCustomer(@RequestBody CustomerForm customerForm) {
		return customerRepositoryCustom.addOrUpdate(customerForm);
	}

	@RequestMapping(value = "/customer/delete/{customerId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteCountry(@PathVariable("countryId") Long customerId) {
		customerRepository.deleteById(customerId);
	}
}
