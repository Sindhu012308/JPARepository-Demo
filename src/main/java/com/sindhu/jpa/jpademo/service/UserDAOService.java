package com.sindhu.jpa.jpademo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sindhu.jpa.jpademo.entity.User;

@Repository
@Transactional
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user){
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}
	
}
/*
 entityManager.persist(user); is similar to User jack = new User("Jack", "Admin")
 entityManger add the user to the database using persist method.
*/