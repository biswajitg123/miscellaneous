package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.calculator.CalculatorRequest;
import com.demo.model.calculator.CalculatorResponse;
import com.demo.service.CalculatorService;
import com.demo.service.impl.CalculatorServiceImpl;

@RestController
public class MiscellaneousController {
	
	private CalculatorService calculatorService = new CalculatorServiceImpl();
	
	@PostMapping("/calculator")
	public CalculatorResponse calculate(@RequestBody CalculatorRequest request) {
		
		CalculatorResponse response = calculatorService.calculate(request);
		
		return response;
		
	}
	
}
