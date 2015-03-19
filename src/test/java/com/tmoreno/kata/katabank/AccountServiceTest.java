package com.tmoreno.kata.katabank;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {

	@Mock
	private DepositService depositService;

	@Mock
	private WithdrawService withdrawService;

	@Test
	public void shouldCallDeposit() {
		AccountService accountService = new AccountService(depositService);

		accountService.deposit(1000);

		verify(depositService).deposit(1000);
	}

	@Test
	public void shouldCallWithdraw() {
		AccountService accountService = new AccountService(depositService);

		accountService.withdraw(100);

		verify(withdrawService).withdraw(100);
	}
}
