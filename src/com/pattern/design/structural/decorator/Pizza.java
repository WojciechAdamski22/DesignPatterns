package com.pattern.design.structural.decorator;

public class Pizza implements Item {

	@Override
	public void prepare() {
		System.out.print("Pizza");
	}

}
