package br.com.xandecoelho5.decorator.coffeeShop.model.decorators;

import br.com.xandecoelho5.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {

    protected final Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
