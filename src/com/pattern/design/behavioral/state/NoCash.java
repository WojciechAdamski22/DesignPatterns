package com.pattern.design.behavioral.state;

public class NoCash implements AtmState {

	Atm atm;

	NoCash(Atm atm) {
		this.atm = atm;
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Out of Cash");

	}

	@Override
	public void refill(int amount) {
		System.out.println(amount + "$ is loaded");
		atm.setState(new Working(atm));
		atm.setCashStock(atm.getCashStock() + amount);

	}

}
