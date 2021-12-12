package com.demo.service;

import com.demo.model.calculator.CalculatorRequest;
import com.demo.model.calculator.CalculatorResponse;


public interface CalculatorService {

	public CalculatorResponse calculate(CalculatorRequest request);
	
}
