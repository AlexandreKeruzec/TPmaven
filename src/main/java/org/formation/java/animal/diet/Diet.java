package org.formation.java.animal.diet;

import org.formation.java.animal.Food;

public abstract class Diet {
	public void eat(Food food) {
		System.out.println("is eating " + food.getName());
	};

}
