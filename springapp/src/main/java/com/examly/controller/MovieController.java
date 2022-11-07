package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.dao.ILikeModel;
import com.examly.model.LikeModel;
import com.examly.dao.ILogin;
import com.examly.model.Login;
import com.examly.dao.IUser;
import com.examly.model.User;
import com.examly.dao.IMovie;
import com.examly.model.Movie;

@RestController
public class MovieController {
    @Autowired
	IMovie movie;
    @GetMapping("movie")
	public String findAll() {
		movie.findAll(); 
		return "Array of Movie";
	}
    @GetMapping("movie/{movieId}")
	public String search(@PathVariable("movieId")int movieId) {
		movie.findById(movieId);
        return "Movie Details";
	}
}
