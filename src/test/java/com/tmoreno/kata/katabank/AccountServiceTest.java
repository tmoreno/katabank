package com.tmoreno.kata.katabank;

import org.mockito.Mockito;

public class AccountServiceTest {

	public void shouldCallDeposit() {
		DepositService depositService = Mockito.mock(DepositService.class);
		AccountService accountService = new AccountService();

		accountService.deposit(1000);

		Mockito.verify(depositService).deposit(1000);
	}
}
