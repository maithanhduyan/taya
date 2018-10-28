/**
 * TAYAFOOD 2018
 */
package com.taya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AnMTD
 */

@Controller
public class MainRestController {

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

}
