package io.github.kjrg.orders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the home page of the application.
 * 
 * @author Kris
 */
@Controller
public class HomeController {

	private static final String HOME_PAGE_VIEW_NAME = "index";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage() {
		return HOME_PAGE_VIEW_NAME;
	}
}
