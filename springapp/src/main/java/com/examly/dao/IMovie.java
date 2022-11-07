package com.examly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.model.Movie;
public interface IMovie extends JpaRepository<Movie, Integer>{
    
}
