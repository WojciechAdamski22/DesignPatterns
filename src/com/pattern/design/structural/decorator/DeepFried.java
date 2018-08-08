package com.pattern.design.structural.decorator;

public class DeepFried extends PizzaDecorator {

	public DeepFried(Item item) {
		super(item);
	}

	@Override
	public void prepare() {
		super.prepare();
		System.out.print(" + Deep Fried");
	}
}
