package com.pattern.design.creational.factorymethod;

public class Motorcycle implements Vehicle {

	protected Motorcycle() {
		/* Constructor is protected. Clients need to use the factory method */
	}

	@Override
	public void design() {
		System.out.println("Designing motorcycle");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing motorcycle");
	}

}
