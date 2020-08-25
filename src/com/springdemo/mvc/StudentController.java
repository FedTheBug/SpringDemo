package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	//Model parameter to pass data between controllers and views 
	public String showForm(Model theModel) {
		
		//Create a student object
		student theStudent = new student();
		
		//add the student object to the model
		theModel.addAttribute("Student", theStudent);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("Student") student theStudent, 
			BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}
		else {
			return "student-confirmation";
		}
//		System.out.println("The student: "+theStudent.getFirstName()
//		+" The Student: "+ theStudent.getLastName());
		
//		return "student-confirmation";
	}

}
