package com.examly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.model.LikeModel;
public interface ILikeModel extends JpaRepository<LikeModel, String>{
    
}
