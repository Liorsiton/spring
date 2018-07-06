package com.spring.course.imdb.dao;

import java.util.HashMap;
import java.util.Map;

import com.spring.course.imdb.movies.Movie;

public class MovieDao {
	
	private Map<Integer,Movie> movies ;
	
	
	public MovieDao(Map<Integer,Movie> movies){
		this.movies = movies;
	}
	
	
	public Map<Integer, Movie> getMovies() {
		return movies;
	}


	public void setMovies(Map<Integer, Movie> movies) {
		this.movies = movies;
	}




	@Override
	public String toString() {
		return "MovieDao [movies=" + movies + "]";
	}
	
	
	
	
	
	

}
