package com.pattern.design.creational.builder;

public class BuilderClient {
	public static void main(final String[] arguments) {
		HouseBuilder builder = new ConcreteHouseBuilder();
		HouseBuildDirector director = new HouseBuildDirector(builder);
		System.out.println(director.construct());
		
		builder = new WoodenHouseBuilder();
		director = new HouseBuildDirector(builder);
		System.out.println(director.construct());
	}
}
