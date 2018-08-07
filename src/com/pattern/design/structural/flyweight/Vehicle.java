package com.pattern.design.structural.flyweight;

public class Vehicle {

	private String name;
	private final String task;
	private String type;
	private String color;
	private int speed;
	private boolean active;
	private int duration;

	public Vehicle(String name) {
		/* Intrinsic state of the object */
		task = "Obstruct the racers";
		this.name = name;
	}

	public void setProperties(String type, String color, int speed, int duration) {
		this.type = type;
		this.color = color;
		this.speed = speed;
		this.duration = duration;
	}

	public boolean isActive() {
		return active;
	}

	public void addToTraffic() {

		/* add the vehicle to the traffic */
		System.out.println("->" + name + "-" + type + "-" + color + "-" + speed + "mph-" + duration + "seconds");
		/*
		 * Create a timer task to take the vehicle out from the traffic after the
		 * duration
		 */
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				active = false;
				System.out.println(name + " -> out");
			}
		}, duration * 1000);
		active = true;
	}
}
