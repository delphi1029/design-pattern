package com.dp.decorator;

public class Mocha extends CondimentDecorator{
	
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		super("Mocha");
		this.beverage = beverage;
	}

	
	@Override
	public double cost() {
		return beverage.cost()+0.5;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

}
