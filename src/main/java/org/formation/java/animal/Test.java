package org.formation.java.animal;

import org.formation.java.animal.animals.Lion;
import org.formation.java.animal.animals.Rabbit;

public class Test {
	
	// TODO use the diet from carnivore and herbivore when needed instead of Diet.eat()
	// TODO find a way to modify Animal attributes from Diet.eat() -> create a reference to the animal in the diet

	public static void main(String[] args) {
		Plant plant = new Plant("grass");
		Meat meat = new Meat("steak");
		
		Rabbit rabbit = new Rabbit("lapin de garenne", 1, 2f, 0.45f);
		Lion lion = new Lion("lion", 5, 190f, 2.1f);
		
		rabbit.eat(plant);
		lion.eat(meat);
		
		lion.eat(rabbit);		
	}

}
