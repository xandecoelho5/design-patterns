package br.com.xandecoelho5.mediator.swing.components;

import br.com.xandecoelho5.mediator.swing.mediator.Mediator;

public class State {
	private final Mediator mediator;
	private int counter;
	
	public State(Mediator mediator) {
		this.mediator = mediator;
		counter = 0;
	}
	
	public void addCount() {
		counter++;
		if(counter == 10) {
			mediator.stop();
		}
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
