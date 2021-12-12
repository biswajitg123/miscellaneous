package com.demo.service;

import org.springframework.stereotype.Component;

import com.demo.model.calculator.CalculatorRequest;
import com.demo.model.calculator.CalculatorResponse;

@Component
public interface CalculatorService {

	public CalculatorResponse calculate(CalculatorRequest request);
	
}
