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

import com.examly.dao.IMovie;
import com.examly.model.Movie;

@RestController
public class AdminMovieController {
    @Autowired
	IMovie movie;
    @GetMapping("admin/movie")
	public String findAll() {
		movie.findAll(); 
		return "Array of Movie";
	}
    @DeleteMapping("admin/movie/{movieId}")
	public String delete(@PathVariable("movieId")int movieId) {
		movie.deleteById(movieId);
		return "Movie deleted";
	}
    @PutMapping("admin/movie/{movieId}")
	public String update(@RequestBody Movie m,@PathVariable("movieId")int movieId) {
		movie.findById(movieId).map(mu->{
			mu.setMovieName(m.getMovieName());
			mu.setMovieUrl(m.getMovieUrl());
			mu.setMoviePosterUrl(m.getMoviePosterUrl());
			mu.setMovieCast(m.getMovieCast());
			mu.setLikes(m.getLikes());
			return movie.save(mu);
		});
		
		return "Save the Changes";
	}
}
