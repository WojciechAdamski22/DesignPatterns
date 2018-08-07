package com.pattern.design.behavioral.state;

public class Working implements AtmState {

	Atm atm;

	Working(Atm atm) {
		this.atm = atm;
	}

	@Override
	public void withdraw(int amount) {
		int cashStock = atm.getCashStock();
		if (amount > cashStock) {
			amount = cashStock;
			System.out.print("Partial amount ");
		}
		System.out.println(amount + "$ is dispensed");
		int newCashStock = cashStock - amount;
		atm.setCashStock(newCashStock);
		if (newCashStock == 0) {
			atm.setState(new NoCash(atm));
		}
	}

	@Override
	public void refill(int amount) {
		System.out.println(amount + "$ is loaded");
		atm.setCashStock(atm.getCashStock() + amount);
	}

}
