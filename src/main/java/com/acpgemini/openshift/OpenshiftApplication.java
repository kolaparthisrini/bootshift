package com.acpgemini.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class OpenshiftApplication {

	@RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    } 
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
