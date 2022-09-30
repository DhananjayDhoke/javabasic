package com.firstProject.firstSpringProject.helloworld;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;


@RestController

public class HelloWorldController {
	//@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping(path="/hello")
	
    public String HelloWorld() {
		
		return "Hellow World";
	}
	
	
	@GetMapping(path="/hello-bean")
	public helloWordBean helloWorldBean() {
		return new helloWordBean("Hellow World");
	}
	
	@GetMapping(path="/hello-bean/variable-path/{name}")
      public String helloWorld(@PathVariable String name) {
		
		return "Hellow World"+" "+name;
	}
}
