package com.springBootProjects.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public  class SayHelloController {
	
	@RequestMapping("say-hello-jsp")
//	@ResponseBody this return the string as it is
	public String sayHello() {
		return "sayHello";
	}
}
