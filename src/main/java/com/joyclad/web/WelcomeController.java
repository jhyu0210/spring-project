package com.joyclad.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/helloworld")
	public String welcome(String name, int age,Model model) {
		System.out.println("name: "+name + " age: " + age);
		model.addAttribute("name", name);//template에 name으로 변수 name이 전달된다.
		model.addAttribute("age", age);
		return "welcome";
	}
}
