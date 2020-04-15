package com.revature.driver;

import com.reavture.beans.Animal;
import com.reavture.beans.Cat;

public class Driver {
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = new Animal();
		
		a.setAge(34);
		c.setColor("blue");
		System.out.println(a.getAge());
		System.out.println(c.getColor());
	}
}