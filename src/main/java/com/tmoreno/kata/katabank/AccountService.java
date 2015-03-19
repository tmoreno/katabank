package com.tmoreno.kata.katabank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

	private DepositService depositService;

	private WithdrawService withdrawService;

	private Date date;

	private Console console;

	private int balance;

	private List<String> operations;

	public AccountService(DepositService depositService,
			WithdrawService withdrawService, Date date, Console console) {

		this.depositService = depositService;
		this.withdrawService = withdrawService;
		this.date = date;
		this.console = console;

		operations = new ArrayList<>();
	}

	public void deposit(int amount) {
		depositService.deposit(amount);

		balance += amount;

		operations.add(date.getDate() + " | " + amount + " | " + balance);
	}

	public void withdraw(int amount) {
		withdrawService.withdraw(amount);

		balance -= amount;

		operations
				.add(date.getDate() + " | " + (amount * -1) + " | " + balance);
	}

	public void printStatement() {
		console.printLine("DATE | AMOUNT | BALANCE");

		for (String operation : operations) {
			console.printLine(operation);
		}
	}
}
