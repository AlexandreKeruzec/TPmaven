package org.formation.java.animal.animals;

import org.formation.java.animal.Animal;
import org.formation.java.animal.diet.Carnivore;

public class Hyena extends Animal {

	public Hyena(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Carnivore());
	}

}
