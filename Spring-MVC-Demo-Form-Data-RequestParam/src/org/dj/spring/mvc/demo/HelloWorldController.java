package org.dj.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest req, Model model) {
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
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// read the request parameter from the HTML form
//		String theName = req.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create a message
		String result = "Hey my Friend!!! " + theName;

		// Add message to the model
		model.addAttribute("message", result);

		return "helloworld-process";
	}
}