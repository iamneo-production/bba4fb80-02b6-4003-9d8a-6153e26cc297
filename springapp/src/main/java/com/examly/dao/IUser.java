package com.examly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.model.User;

public interface IUser extends JpaRepository<User, Integer>{

}
