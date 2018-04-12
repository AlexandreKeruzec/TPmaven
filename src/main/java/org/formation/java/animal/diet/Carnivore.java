package org.formation.java.animal.diet;

import org.formation.java.animal.Food;
import org.formation.java.animal.Meat;

public class Carnivore extends Diet {
	public void eat(Meat food) {
		eat((Food) food);
	}
}
