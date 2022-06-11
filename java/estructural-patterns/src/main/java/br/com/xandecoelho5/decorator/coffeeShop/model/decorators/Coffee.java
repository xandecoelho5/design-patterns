package br.com.xandecoelho5.decorator.coffeeShop.model.decorators;

import br.com.xandecoelho5.decorator.coffeeShop.model.Drink;

public class Coffee extends DrinkDecorator {

    public Coffee(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30g of coffee");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5;
    }
}
