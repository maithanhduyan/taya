/**
 * TayaFood 2018
 */
package com.taya.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mai Thành Duy An
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("dateTime", new Date());
		model.addAttribute("mode", appMode);
		return "index";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin/index.html";
	}

	@RequestMapping("/admin/transaction/*")
	public String transaction() {
		return "admin/transaction.html";
	}

	@Autowired
	public HomeController(Environment environment) {
		appMode = environment.getProperty("app-mode");
	}

	private String appMode;

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
}
