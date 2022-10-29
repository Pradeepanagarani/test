package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;

@RestController // @controller + @ResponseBody
public class sample {
	
	
	@GetMapping("/home") // from ui what pattern we are giving it will match
	public String simple() {
		
		System.out.println("hai");
		return "get mapping view";

	}
	
	
	
	
	@PostMapping("/login")
	public String postex(@RequestBody student stud) {
		
		System.out.println(stud.getName());
		return stud.getId() + "---"+ stud.getName();

	}

}

