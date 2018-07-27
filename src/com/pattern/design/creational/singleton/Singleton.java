package com.pattern.design.creational.singleton;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				/* double checked locking */
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void printObj() {
		System.out.println("Unique Id of the obj: " + System.identityHashCode(this));
	}
}
