package com.nn.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import com.nn.cms.entities.User;
import com.nn.cms.repositories.UserRepository;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class CmsApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		userRepository.save( new User("naresh","nayak"));
		userRepository.save( new User("nidhish","nayak"));
		
	}
}
