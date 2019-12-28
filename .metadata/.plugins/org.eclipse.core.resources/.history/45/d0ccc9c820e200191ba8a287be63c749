package org.dj.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-process";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest req, Model model) {
		// read the request parameter from the HTML form
		String theName = req.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create a message
		String result = "Yo!!! " + theName;

		// Add message to the model
		model.addAttribute("message", result);

		return "helloworld-process";
	}
}