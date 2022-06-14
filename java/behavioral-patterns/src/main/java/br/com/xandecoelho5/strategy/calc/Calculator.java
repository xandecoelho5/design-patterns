package br.com.xandecoelho5.strategy.calc;

import br.com.xandecoelho5.strategy.calc.strategies.OperationStrategy;

public class Calculator {
	private final int num1;
	private final int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getResult(OperationStrategy strategy) {
		return strategy.calculate(num1, num2);
	}
}
