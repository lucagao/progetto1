package com.example.restservice;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
		AtomicInteger counter = new AtomicInteger(0);
	
		@GetMapping("/greeting")
		public Greeting greeting(@RequestParam( name="name", defaultValue="world" )String name) {
			return new Greeting(counter.incrementAndGet(),
					"Hello, " +name);
		}
}
