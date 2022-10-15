package com.Accountdao;

import javax.persistence.EntityManager;

import com.account.bean.Account;

import com.accountUtil.EMutil;


public class AccountDaoIml implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		boolean flag=false;
		EntityManager em= EMutil.providEntityManager();
		
		em.getTransaction().begin();
		em.persist(account);
		flag=true;
		em.getTransaction().commit();
		
		em.close();
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		EntityManager em= EMutil.providEntityManager();
		Account acc= em.find(Account.class, accno);
		if(acc!=null) {
			em.getTransaction().begin();
			em.remove(acc);
			flag=true;
			em.getTransaction().commit();
		}
		
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag=false;
	
		
		EntityManager em= EMutil.providEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(account);
		flag=true;
		
		em.getTransaction().commit();
		
		
		em.close();
		
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		// TODO Auto-generated method stub
		return EMutil.providEntityManager().find(Account.class, accno);
	}

	

}
