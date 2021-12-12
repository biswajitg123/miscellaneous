package com.demo.service.impl;

import org.springframework.stereotype.Component;

import com.demo.model.calculator.CalculatorRequest;
import com.demo.model.calculator.CalculatorResponse;
import com.demo.service.CalculatorService;

@Component
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public CalculatorResponse calculate(CalculatorRequest request) {

		CalculatorResponse response = new CalculatorResponse();
		double result = 0;

		switch (request.getOperator()) {

			case "+": {
	
				result = request.getNumber1() + request.getNumber2();
				break;
			}
	
			case "-": {
	
				result = request.getNumber1() - request.getNumber2();
				break;
	
			}
	
			case "*": {
	
				result = request.getNumber1() * request.getNumber2();
				break;
	
			}
	
			case "/": {
	
				if (request.getNumber1() != 0 || request.getNumber2() != 0) {
	
					if (request.getNumber2() != 0) {
						result = request.getNumber1() / request.getNumber2();
					} else {
						result = request.getNumber2() / request.getNumber1();
					}
				}
				else 
					result = 0;
				break;
			}
			
			default : {
				
			}
		}
//		BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
//		result = bd.doubleValue();
		response.setResult(result);
		return response;
	}

}
