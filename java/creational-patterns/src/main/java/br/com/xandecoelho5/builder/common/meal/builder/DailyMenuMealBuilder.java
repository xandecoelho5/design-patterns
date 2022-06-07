package br.com.xandecoelho5.builder.common.meal.builder;

public class DailyMenuMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Big Mac");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Ice Cream");
    }

    @Override
    public void buildToy() {
        meal.setToy("Toy'story toy");
    }
}
