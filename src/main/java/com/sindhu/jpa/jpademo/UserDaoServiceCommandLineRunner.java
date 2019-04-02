package com.sindhu.jpa.jpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sindhu.jpa.jpademo.entity.User;
import com.sindhu.jpa.jpademo.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Jack","Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is Created:" + user);
		
	}

}
