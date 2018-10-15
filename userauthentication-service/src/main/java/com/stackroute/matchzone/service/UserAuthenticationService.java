package com.stackroute.matchzone.service;

import java.util.Map;

import com.stackroute.matchzone.exception.UserAlreadyExistsException;
import com.stackroute.matchzone.exception.UserIdAndPasswordMismatchException;
import com.stackroute.matchzone.exception.UserNotFoundException;
import com.stackroute.matchzone.model.User;

public interface UserAuthenticationService {

	public Map<String, String> generateToken(String emailId, String password)
			throws UserNotFoundException, UserIdAndPasswordMismatchException;

	boolean saveUser(User user) throws UserAlreadyExistsException;

}
