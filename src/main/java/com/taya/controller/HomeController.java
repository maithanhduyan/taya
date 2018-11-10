/**
 * TayaFood 2018
 */
package com.taya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mai Thành Duy An
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome() {
		return "index.html";
	}
}
