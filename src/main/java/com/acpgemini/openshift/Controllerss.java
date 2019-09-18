package com.acpgemini.openshift;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class Controllerss {  
    @RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    }  
}  