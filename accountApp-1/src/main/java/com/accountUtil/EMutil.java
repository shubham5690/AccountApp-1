package com.accountUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("accountUnit");
		
	}
	public static EntityManager providEntityManager() {
		return emf.createEntityManager();
	}
	
}
