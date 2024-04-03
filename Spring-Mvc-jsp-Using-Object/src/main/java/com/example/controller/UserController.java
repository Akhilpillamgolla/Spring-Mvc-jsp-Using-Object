package com.example.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.UserUsingObjects;


@Controller
public class UserController {

	@GetMapping("/user")
	public String getUserData(Model model) {
		
		UserUsingObjects userobj = new UserUsingObjects();
		userobj.setUserId(2160504);
		userobj.setFirstName("Pillamgolla Akhil");
		userobj.setLastName("Akhil");
		userobj.setGender("Male");
		userobj.setDob("04-10-2000");
		
		model.addAttribute("userdata", userobj);  // key & value (Strong user Object into Model)		
		
		return "user";
	}
	
}
