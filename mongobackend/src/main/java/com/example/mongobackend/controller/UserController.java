package com.example.mongobackend.controller;

import com.example.mongobackend.Start.User;
import com.example.mongobackend.repository.UserRepo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RequestMapping("/user")
public class UserController {
	
	private final Logger logger = Logger.getLogger(UserController.class.getName());

	private UserRepo userRepo;

	public UserController(UserRepo userRepo) {
		this.userRepo = userRepo;
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(@RequestBody User newuser){
		userRepo.insert(newuser);
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	@RequestMapping(value ="/find/{id}", method = RequestMethod.GET)
	public List<User> read(@PathVariable("id") String  id){
        return userRepo.findByAccountNumber(id);
	}
	

	@RequestMapping(value ="/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@PathVariable User user){
		userRepo.save(user);

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		 List<User> users = userRepo.findByAccountNumber(id);
			 userRepo.deleteAll(users);
		}

		

	
}
