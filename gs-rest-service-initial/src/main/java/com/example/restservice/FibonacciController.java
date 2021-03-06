package com.example.restservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

	@GetMapping("/fibonacci")
	public Fibonacci fibonacci(@RequestParam(name = "num") int num) {
		ArrayList<Integer> numero = new ArrayList<Integer>();

		int x = 0;
		if (num >= 0) {
			numero.add(0);
			x++;
		}
		if (num >= 1) {
			numero.add(1);
			x++;
		}
		while (num >= (numero.get(x - 1) + numero.get(x - 2))) {
			numero.add(numero.get(x - 1) + numero.get(x - 2));
			x++;
		}
		return new Fibonacci(x, numero);
	}
}
