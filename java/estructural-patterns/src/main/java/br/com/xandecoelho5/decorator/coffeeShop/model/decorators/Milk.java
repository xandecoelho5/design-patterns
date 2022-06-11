package br.com.xandecoelho5.decorator.coffeeShop.model.decorators;

import br.com.xandecoelho5.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 50ml of milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.75;
    }
}
