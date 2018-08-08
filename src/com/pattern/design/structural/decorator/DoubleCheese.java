package com.pattern.design.structural.decorator;

public class DoubleCheese extends PizzaDecorator {

	public DoubleCheese(Item item) {
		super(item);
	}

	@Override
	public void prepare() {
		super.prepare();
		System.out.print(" + Double Cheese");
	}
}
