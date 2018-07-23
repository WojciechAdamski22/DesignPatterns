package com.pattern.design.behavioral.command.objects;

/**
 * 
 *	Receiver class for the commands
 *
 */
public class MainDish {
	String name;

	public MainDish(String name) {
		this.name = name;
	}
	
	public void order() {
		System.out.println("Main Dish (" + name + ") is ordered");
	}
	
	public void cancel() {
		System.out.println("Main Dish (" + name + ") is cancelled");
	}
}