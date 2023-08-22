package com.example.demod1.name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@Value("Vetri")
		public String name;
		@GetMapping("/display")
		public String display()
		{
			return "Welcome "+name;
		}

	}