package com.qa.PersonProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PersonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonProjectApplication.class, args);
	}

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

}
