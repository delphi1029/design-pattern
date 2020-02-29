package com.dp.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		super("Espresso");
	}

	@Override
	public double cost() {
		return 2.5;
	}

}
