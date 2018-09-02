package com.example.mongobackend.repository;

import com.example.mongobackend.Start.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepo extends MongoRepository<User, String>{

	@Query("{ AccountNumber: ?0 }")
	List<User> findByAccountNumber(String AccountNumber);


	User deleteUserByAccountNumber(String AccountNumber);


}
