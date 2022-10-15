package com.usecase;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import com.Accountdao.AccountDao;
import com.Accountdao.AccountDaoIml;
import com.account.bean.Account;

public class DepositUseCase {
	public static void main(String[] args) {
		AccountDao dao=new AccountDaoIml();
		Account account=new Account();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your address : ");
		String add=input.next();
		System.out.println("Enter your email : ");
		String email=input.next();
		System.out.println("Enter your balance : ");
		int bal=input.nextInt();
		
		account.setAddress(add);
		account.setEmail(email);
		account.setBalance(bal);
		
		boolean f=dao.createAccount(account);
		if(f) {
			System.out.println("account is created");
		}
		else {
			System.out.println("not created....");
		}
	}
}
