package com.pattern.design.structural.decorator;

public class Spicy extends PizzaDecorator {

	public Spicy(Item item) {
		super(item);
	}

	@Override
	public void prepare() {
		super.prepare();
		System.out.print(" + Spicy");
	}
}
