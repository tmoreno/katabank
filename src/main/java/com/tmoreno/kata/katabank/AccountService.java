package com.tmoreno.kata.katabank;

public class AccountService {

	private DepositService depositService;

	private WithdrawService withdrawService;

	public AccountService(DepositService depositService,
			WithdrawService withdrawService) {
		this.depositService = depositService;
		this.withdrawService = withdrawService;
	}

	public void deposit(int amount) {
		depositService.deposit(amount);
	}

	public void withdraw(int amount) {
		withdrawService.withdraw(amount);
	}

	public void printStatement() {

	}
}
