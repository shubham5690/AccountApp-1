package com.usecase;

import java.util.Scanner;

import com.Accountdao.AccountDao;
import com.Accountdao.AccountDaoIml;

public class DeleteAccount {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your account ID :");
		int id=input.nextInt();
		AccountDao dao=new AccountDaoIml();
		
		
		boolean f=dao.deleteAccount(id);
		if(f) System.out.println("account is removed with an id= "+id);
		else System.out.println("no such account exist with this id= "+id);
	}
}
