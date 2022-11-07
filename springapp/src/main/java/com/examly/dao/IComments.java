package com.examly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.model.Comments;
public interface IComments extends JpaRepository<Comments, Integer>{
    
}
