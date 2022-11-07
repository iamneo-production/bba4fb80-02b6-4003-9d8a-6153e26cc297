package com.examly.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private int movieId;
	private String movieName;
	private String movieUrl;
	private String moviePosterUrl;
	private String movieCast;
    private String likes;
    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieUrl() {
        return movieUrl;
    }
    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }
    public String getMoviePosterUrl() {
        return moviePosterUrl;
    }
    public void setMoviePosterUrl(String moviePosterUrl) {
        this.moviePosterUrl = moviePosterUrl;
    }
    public String getMovieCast() {
        return movieCast;
    }
    public void setMovieCast(String movieCast) {
        this.movieCast = movieCast;
    }
    public String getLikes() {
        return likes;
    }
    public void setLikes(String likes) {
        this.likes = likes;
    }
    

    
}
