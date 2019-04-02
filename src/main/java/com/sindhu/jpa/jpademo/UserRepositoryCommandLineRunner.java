package com.sindhu.jpa.jpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sindhu.jpa.jpademo.entity.User;
import com.sindhu.jpa.jpademo.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jill","Admin");
		userRepository.save(user);
		
		log.info("New User is Created:" + user);
	}

}
