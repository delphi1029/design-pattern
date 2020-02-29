package com.dp.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		Beverage b1 = new DarkRoast();
		b1 = new Mocha(b1);
		b1 = new Milk(b1);
		
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		
		Beverage b2 = new Espresso();
		b2 = new Milk(b2);
		
		System.out.println(b2.getDescription());
		System.out.println(b2.cost());

	}

}
