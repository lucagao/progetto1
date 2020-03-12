package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageController {
		
		@GetMapping("/addizione")
		public int addizione(@RequestParam int operatore1, int operatore2) {
			return operatore1+operatore2;
		}
		
		@GetMapping("/sottrazione")
		public int sottrazione(@RequestParam int operatore1, int operatore2) {
			return operatore1-operatore2;
		}
		@GetMapping("/moltiplicazione")
		public int moltiplicazione(@RequestParam int operatore1, int operatore2) {
			return operatore1*operatore2;
		}
		@GetMapping("/divisione")
		public double divisione(@RequestParam double operatore1, double operatore2) {
			return operatore1/operatore2;
		}
	
}
