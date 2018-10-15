package com.stackroute.matchzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchzone.model.User;

/*Marking this class as @Repository as it will interact with the MongoDB
 * */

@Repository
public interface UserAuthenticationRepository extends JpaRepository<User, String> 
{
	
	User findByUserEmailAndUserPassword(String userEmail, String userPassword);
}
