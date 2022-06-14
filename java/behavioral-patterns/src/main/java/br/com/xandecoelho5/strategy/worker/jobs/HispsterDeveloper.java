package br.com.xandecoelho5.strategy.worker.jobs;

import br.com.xandecoelho5.strategy.worker.strategies.eat.VeggieFoodStrategy;
import br.com.xandecoelho5.strategy.worker.strategies.transportation.BikeStrategy;
import br.com.xandecoelho5.strategy.worker.strategies.work.DeveloperStrategy;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
