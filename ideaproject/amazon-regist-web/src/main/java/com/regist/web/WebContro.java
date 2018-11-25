package com.regist.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class WebContro {

	@RequestMapping("/test")
	public void testContro() {
		System.out.println("successful");
		
		
	}
	
}
