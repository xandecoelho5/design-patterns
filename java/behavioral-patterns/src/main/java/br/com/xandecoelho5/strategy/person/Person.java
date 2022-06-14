package br.com.xandecoelho5.strategy.person;

import br.com.xandecoelho5.strategy.person.strategies.eat.EatStrategy;
import br.com.xandecoelho5.strategy.person.strategies.transportation.TransportationStrategy;
import br.com.xandecoelho5.strategy.person.strategies.work.WorkStrategy;

public class Person {
	private final EatStrategy eatStrategy;
	private final TransportationStrategy moveStrategy;
	private final WorkStrategy workStrategy;
	private final String name;

	public Person(String name, EatStrategy eatStrategy, TransportationStrategy moveStrategy, WorkStrategy workStrategy) {
		this.name = name;
		this.eatStrategy = eatStrategy;
		this.moveStrategy = moveStrategy;
		this.workStrategy = workStrategy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		eatStrategy.eat();
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void work() {
		workStrategy.work();
	}
}
