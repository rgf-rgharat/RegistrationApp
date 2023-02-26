package com.registration.app.createaccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.app.createaccount.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByEmail(String email);
}
