package org.formation.java.animal;

import org.formation.java.animal.diet.Diet;

public abstract class Animal extends Meat{
	private int age;
	private float weight;
	private float size;
	private Diet diet;
	
	public void eat(Food food) {
		System.out.print(getName() + " ");
		diet.eat(food);
		}
	public void move() {}
	
	public Animal(String name, int age, float weight, float size, Diet diet) {
		super(name);
		this.age = age;
		this.weight = weight;
		this.size = size;
		this.diet = diet;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
}
