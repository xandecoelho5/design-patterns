package br.com.xandecoelho5.observer.party;

import br.com.xandecoelho5.observer.party.observers.Friend;
import br.com.xandecoelho5.observer.party.observers.Wife;
import br.com.xandecoelho5.observer.party.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}
}
