package br.com.xandecoelho5.builder.common.meal.builder;

public class XDeathMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("4L Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("3x Mega Mac");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries And Fried Onions");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Pudding");
    }
}
