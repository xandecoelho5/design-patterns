package br.com.xandecoelho5.strategy.calc;

import br.com.xandecoelho5.strategy.calc.strategies.AdditionOperation;
import br.com.xandecoelho5.strategy.calc.strategies.DivisionOperation;
import br.com.xandecoelho5.strategy.calc.strategies.MultiplicationOperation;
import br.com.xandecoelho5.strategy.calc.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
