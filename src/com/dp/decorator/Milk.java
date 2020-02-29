package com.dp.decorator;

public class Milk extends CondimentDecorator{
	
private Beverage beverage;
	
	public Milk(Beverage beverage) {
		super("Milk");
		this.beverage = beverage;
	}

	
	@Override
	public double cost() {
		return beverage.cost()+0.3;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Milk";
	}

}
