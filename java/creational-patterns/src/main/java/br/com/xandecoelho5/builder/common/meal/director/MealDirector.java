package br.com.xandecoelho5.builder.common.meal.director;

import br.com.xandecoelho5.builder.common.meal.builder.FastFoodMealBuilder;
import br.com.xandecoelho5.builder.common.meal.model.FastFoodMeal;

public class MealDirector {

    private final FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void orderMeal() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildToy();
    }

    public FastFoodMeal getMeal() {
        return builder.getMeal();
    }
}
