package com.vicky.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping
	public String sample() 
	{
		System.out.println("Master Branch");
		return "success";
	}
}
