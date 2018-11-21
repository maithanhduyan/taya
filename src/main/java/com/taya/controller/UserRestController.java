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

import com.taya.form.UserForm;
import com.taya.model.User;
import com.taya.repository.UserRepository;
import com.taya.repository.UserRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class UserRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRepositoryCustom userRepositoryCustom;

	@RequestMapping("/user")
	@ResponseBody
	public List<User> getUser() {
		return userRepository.findAll();
	}

	@RequestMapping("//user/{userId}")
	@ResponseBody
	public User getRegionById(@PathVariable("userId") Long userId) {
		User region = null;
		try {
			region = userRepository.findById(userId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return region;
		}
		return region;
	}

	@RequestMapping(value = "//user/update", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public User updateRegion(@RequestBody UserForm userForm) {
		return userRepositoryCustom.addOrUpdate(userForm);
	}

	@RequestMapping(value = "//user/delete/{/userId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteRegion(@PathVariable("userId") Long userId) {
		userRepository.deleteById(userId);
	}
}
