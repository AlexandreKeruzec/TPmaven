package org.formation.java.animal.animals;

import org.formation.java.animal.Animal;
import org.formation.java.animal.diet.Herbivore;

public class Rabbit extends Animal {

	public Rabbit(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Herbivore());
	}

}
