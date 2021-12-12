package com.demo.model.calculator;

public class CalculatorResponse {

	private double result;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "CalculatorResponse [result=" + result + "]";
	}
	
}
