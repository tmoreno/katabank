package com.tmoreno.kata.katabank;

public class AccountService {

	private DepositService depositService;

	public AccountService(DepositService depositService) {
		this.depositService = depositService;
	}

	public void deposit(int amount) {
		depositService.deposit(amount);
	}

	public void withdraw(int amount) {

	}

	public void printStatement() {

	}
}
