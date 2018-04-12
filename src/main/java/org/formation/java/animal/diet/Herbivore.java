package org.formation.java.animal.diet;

import org.formation.java.animal.Food;
import org.formation.java.animal.Plant;

public class Herbivore extends Diet {
	public void eat(Plant food) {
		eat((Food) food);
	}
}
