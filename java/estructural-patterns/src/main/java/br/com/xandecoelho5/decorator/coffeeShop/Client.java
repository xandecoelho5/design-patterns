package br.com.xandecoelho5.decorator.coffeeShop;

import br.com.xandecoelho5.decorator.coffeeShop.model.Drink;
import br.com.xandecoelho5.decorator.coffeeShop.model.Expresso;
import br.com.xandecoelho5.decorator.coffeeShop.model.Tea;
import br.com.xandecoelho5.decorator.coffeeShop.model.decorators.Coffee;
import br.com.xandecoelho5.decorator.coffeeShop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("MilkExpresso", new Milk(new Expresso()));
		order("CoffeTea", new Coffee(new Tea()));
		order("English Tea", new Milk(new Tea()));
	}
}
