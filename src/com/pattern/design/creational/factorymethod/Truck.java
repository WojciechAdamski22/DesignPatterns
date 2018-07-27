package com.pattern.design.creational.factorymethod;

public class Truck implements Vehicle {

	protected Truck() {
		/* Constructor is protected. Clients need to use the factory method */
	}

	@Override
	public void design() {
		System.out.println("Designing truck");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing truck");
	}

}
