package com.regist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regist.bean.User;

@Controller
@RequestMapping("/contro")
public class WebContro {

	@RequestMapping("/regist")
	public String testContro() {
		System.out.println("successful");
		
		return "regist";
	}
	
	@RequestMapping("/reform")
	public String registForm(User user) {
		
		if (user.getUsername()=="") {
			return "nameerr";
		}
		if (user.getPassword()=="") {
			return "pwserr";
		}
		
	  System.out.println(user);
		return "success";
	}
	
}
