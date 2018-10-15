package com.stackroute.matchzone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchzone.exceptions.UserAlreadyExistsException;
import com.stackroute.matchzone.exceptions.UserNotFoundException;
import com.stackroute.matchzone.model.User;
import com.stackroute.matchzone.repository.UserRepository;

//Annotate the class with @Service

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	/*
	 * For injecting the dependency in the UserRepository argument,
	 * 
	 * @Autowired is used. Here the constructor based dependency is performed.
	 */

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	/*
	 * All methods of UserService interface are overriden and implemented
	 */

	@Override
	public boolean createUser(User user) throws UserAlreadyExistsException {
		if (userRepository.insert(user) == null)
			throw new UserAlreadyExistsException("User Already Exists");
		return true;
	}

	@Override
	public boolean deleteUser(String userId) throws UserNotFoundException {
		User user = userRepository.findById(userId).get();
		if (user == null)
			throw new UserNotFoundException("User Not Found");
		userRepository.delete(user);
		return true;
	}

	@Override
	public User updateUser(String userId, User user) throws UserNotFoundException {
		User localUser = userRepository.findById(userId).get();
		if (localUser == null)
			throw new UserNotFoundException("User Not Found");
		if (user.getUserPassword() != null)
			localUser.setUserPassword(user.getUserPassword());
		if (user.getUserName() != null)
			localUser.setUserName(user.getUserName());
		userRepository.save(localUser);
		return localUser;
	}

	@Override
	public User getUser(String userId) throws UserNotFoundException {
		User user = userRepository.findById(userId).get();
		if (user == null)
			throw new UserNotFoundException("User Not Found");
		return user;
	}

}
