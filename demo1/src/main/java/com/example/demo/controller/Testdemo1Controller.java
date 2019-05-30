
package com.example.demo.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/")
public class Testdemo1Controller {
	@RequestMapping("/hello")
	public String hello(String from) {
		return "hello "+from +" returned by server";
	}
	
	@RequestMapping("/tongc")
	public String tongc(String name) {
		String messg = "My name is "+name;
		return messg;
	}
}