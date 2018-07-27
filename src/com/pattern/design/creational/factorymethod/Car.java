package com.pattern.design.creational.factorymethod;

public class Car implements Vehicle {

	protected Car() {
		/* Constructor is protected. Clients need to use the factory method */
	}

	@Override
	public void design() {
		System.out.println("Designing car");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing car");
	}

}
