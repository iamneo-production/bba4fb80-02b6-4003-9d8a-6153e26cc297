package com.examly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.model.Login;
public interface ILogin extends JpaRepository<Login, Integer>{
    
}
