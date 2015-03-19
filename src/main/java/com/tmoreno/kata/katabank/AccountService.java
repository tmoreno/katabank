package com.tmoreno.kata.katabank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

	private DepositService depositService;

	private WithdrawService withdrawService;

	private Console console;

	private List<String> operations;

	public AccountService(DepositService depositService,
			WithdrawService withdrawService, Console console) {

		this.depositService = depositService;
		this.withdrawService = withdrawService;
		this.console = console;

		operations = new ArrayList<>();
	}

	public void deposit(int amount) {
		depositService.deposit(amount);

		operations.add("01/04/2014 | " + amount + " | 1000");
	}

	public void withdraw(int amount) {
		withdrawService.withdraw(amount);
	}

	public void printStatement() {
		console.printLine("DATE | AMOUNT | BALANCE");

		for (String operation : operations) {
			console.printLine(operation);
		}
	}
}
