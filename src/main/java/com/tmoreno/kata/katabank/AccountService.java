package com.tmoreno.kata.katabank;

public class AccountService {

	private DepositService depositService;

	private WithdrawService withdrawService;

	private Console console;

	public AccountService(DepositService depositService,
			WithdrawService withdrawService, Console console) {

		this.depositService = depositService;
		this.withdrawService = withdrawService;
		this.console = console;
	}

	public void deposit(int amount) {
		depositService.deposit(amount);
	}

	public void withdraw(int amount) {
		withdrawService.withdraw(amount);
	}

	public void printStatement() {
		console.printLine("DATE | AMOUNT | BALANCE");
	}
}
