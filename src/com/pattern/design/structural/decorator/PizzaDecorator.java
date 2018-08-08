package com.pattern.design.structural.decorator;

public abstract class PizzaDecorator implements Item {
	private Item pizza;

	public PizzaDecorator(Item item) {
		pizza = item;
	}

	@Override
	public void prepare() {
		pizza.prepare();
	}
}
