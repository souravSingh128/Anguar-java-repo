package com.example.angularJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngularController {
	
   @GetMapping("/hello")
   public String greeting() {
	   return "hello everyone good morning";
   }
}
