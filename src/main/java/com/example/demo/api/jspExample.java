package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspExample {

	 @RequestMapping("/jsp")
	    public String home() {
	        System.out.println("Going home...");
	        return "index";
	    }
}
