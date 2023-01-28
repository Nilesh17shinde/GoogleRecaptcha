package com.sninfotech.app.service;

import java.util.List;

import com.sninfotech.app.model.User;

public interface IUserService {
	Integer createUser(User user);
	List<User> getAllUsers();

}
