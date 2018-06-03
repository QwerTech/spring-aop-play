package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InterceptorApplication {

	@RequestMapping("/")
	public String home(@RequestParam("some") String some, @RequestParam(value = "some1", required = false) String some1) {
		return "Hello World";
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(InterceptorApplication.class).run(args);
	}
}
