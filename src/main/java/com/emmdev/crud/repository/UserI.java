package com.emmdev.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emmdev.crud.model.User;

//@Repository
public interface UserI extends JpaRepository<User, Long> {

}
