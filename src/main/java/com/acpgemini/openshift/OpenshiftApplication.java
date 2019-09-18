package com.acpgemini.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	@RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    } 
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
