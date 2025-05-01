package com.codewithsonu.Sprintboottutorial.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {


    // create  a Restcontroller there which decide all the things con
    @GetMapping("/pa")
    public String helloWorld(){
        return "Hello , this is the first api to collect the data from get mapping ";
    }
    
}
