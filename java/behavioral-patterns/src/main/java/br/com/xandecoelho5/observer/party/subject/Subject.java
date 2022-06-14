package br.com.xandecoelho5.observer.party.subject;

import br.com.xandecoelho5.observer.party.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private final List<Observer> observers = new ArrayList<>();

	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(boolean status) {
		for(Observer o: observers) {
			o.update(status);
		}
	}
}
