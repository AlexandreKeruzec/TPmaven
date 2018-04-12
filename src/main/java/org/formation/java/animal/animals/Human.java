package org.formation.java.animal.animals;

import org.formation.java.animal.Animal;
import org.formation.java.animal.diet.Omnivore;

public class Human extends Animal {

	public Human(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Omnivore());
	}

}
