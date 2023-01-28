package com.sninfotech.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sninfotech.app.model.User;
import com.sninfotech.app.repo.UserRepository;

@Service

public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository repo;

	@Override
	public Integer createUser(User user) {
		// TODO Auto-generated method stub
		Integer userId=repo.save(user).getId();
		return userId;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users=repo.findAll();
		return users;
	}
	

}
