package com.tmoreno.kata.katabank;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
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

	@Mock
	private Date date;

	@Mock
	private Console console;

	private AccountService accountService;

	@Before
	public void setUp() {
		accountService = new AccountService(depositService, withdrawService,
				date, console);
	}

	@Test
	public void shouldCallDeposit() {
		accountService.deposit(1000);

		verify(depositService).deposit(1000);
	}

	@Test
	public void shouldCallWithdraw() {
		accountService.withdraw(100);

		verify(withdrawService).withdraw(100);
	}

	@Test
	public void shouldCallConsole() {
		accountService.printStatement();

		verify(console).printLine("DATE | AMOUNT | BALANCE");
	}

	@Test
	public void printDepositTransaction() {
		when(date.getDate()).thenReturn("01/04/2014");

		accountService.deposit(1000);
		accountService.printStatement();

		verify(console).printLine("DATE | AMOUNT | BALANCE");
		verify(console).printLine("01/04/2014 | 1000 | 1000");
	}
}
