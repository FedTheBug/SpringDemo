package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//Add a method for showing the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}  
	
	//Add a method for processing the form
	@RequestMapping("/processedForm")
	public String processForm() {
		return "processedForm";
	}
	
	//New method to get the data from the form
	//customize it and pass it to the model
	
	@RequestMapping("/processedFormVerTwo")
	public String makeUpperCase(HttpServletRequest request, Model model) {
		
		//Get the data from the form
		String theName = request.getParameter("fname");
		
		//Make the message
		String result = "YO!!! " + theName.toUpperCase();
		
		//Update and make it to the model
		model.addAttribute("message", result);
		
		return "processedForm";
	}

}
