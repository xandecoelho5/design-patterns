package br.com.xandecoelho5.builder.common.meal;

import br.com.xandecoelho5.builder.common.meal.builder.DailyMenuMealBuilder;
import br.com.xandecoelho5.builder.common.meal.builder.XDeathMealBuilder;
import br.com.xandecoelho5.builder.common.meal.director.MealDirector;

public class Client {
	
	public static void main(String[] args) {
		MealDirector director = new MealDirector(new DailyMenuMealBuilder());
		System.out.println("Ordering a daily Meal");
		director.orderMeal();
		System.out.println(director.getMeal());

		System.out.println("Ordering a XDeath Meal");
		director = new MealDirector(new XDeathMealBuilder());
		director.orderMeal();
		System.out.println(director.getMeal());
	}
}
