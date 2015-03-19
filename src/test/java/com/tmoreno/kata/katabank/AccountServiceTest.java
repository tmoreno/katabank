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

	@Test
	public void shouldCallDeposit() {
		AccountService accountService = new AccountService(depositService);

		accountService.deposit(1000);

		verify(depositService).deposit(1000);
	}
}
