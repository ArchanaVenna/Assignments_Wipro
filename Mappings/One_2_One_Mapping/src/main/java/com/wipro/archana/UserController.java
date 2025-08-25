package com.wipro.archana;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private Logger log=LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/addUser")
	public User addNewUser(@RequestBody User user) 
	{
		log.warn("i am hitting repository");
		User SavedUser=repository.save(user);
		log.error("i am hitting repository layer {}");
		return SavedUser;
	}

}
