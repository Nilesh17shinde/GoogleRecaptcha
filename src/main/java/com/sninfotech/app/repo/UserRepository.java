package com.sninfotech.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sninfotech.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
