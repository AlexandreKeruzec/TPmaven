package org.formation.java.animal.animals;

import org.formation.java.animal.Animal;
import org.formation.java.animal.diet.Carnivore;

public class Lion extends Animal {

	public Lion(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Carnivore());
	}

}
