package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningJenkinsCicdApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(LearningJenkinsCicdApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(LearningJenkinsCicdApplication.class, args);
	}

	@RequestMapping(value = "/home")
	public String getName(){
		return "Hello World";
	}

}
