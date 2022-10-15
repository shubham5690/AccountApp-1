package com.usecase;

import java.util.Scanner;

import com.Accountdao.AccountDao;
import com.Accountdao.AccountDaoIml;
import com.account.bean.Account;

public class FindById {
	public static void main(String[] args) {
		AccountDao dao=new AccountDaoIml();
		Scanner input=new Scanner(System.in);
		System.out.println("enter your account ID :");
		int id=input.nextInt();
		
		Account acc=dao.findAccount(id);
		if(acc!=null) System.out.println(acc);
		else System.out.println("account doest not found by this Id= "+id);
		
//		ac.findById(101);
	}

}
