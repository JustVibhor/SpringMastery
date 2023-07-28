package com.justvibhor.springboot.springwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody  // returns the string as it is to the browser
	public String sayHello() {
		return "Hello, you may leave";
	}
}
