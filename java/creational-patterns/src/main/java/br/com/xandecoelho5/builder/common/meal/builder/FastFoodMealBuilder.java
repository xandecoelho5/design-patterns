package br.com.xandecoelho5.builder.common.meal.builder;

import br.com.xandecoelho5.builder.common.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    FastFoodMeal meal;
    public FastFoodMealBuilder() {
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return meal;
    }

    public void buildDrink() {}
    public void buildMain() {}
    public void buildSide() {}
    public void buildDessert() {}
    public void buildToy() {}
}
