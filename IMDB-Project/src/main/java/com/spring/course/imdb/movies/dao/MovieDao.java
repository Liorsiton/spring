package com.spring.course.imdb.movies.dao;

import java.util.HashMap;
import java.util.Map;

import com.spring.course.imdb.movies.Movie;

public class MovieDao {
	
	private Map<Integer,Movie> movies ;
	
	
	public MovieDao(Map<Integer,Movie> movies){
		this.movies = movies;
	}


	@Override
	public String toString() {
		return "MovieDao [movies=" + movies + "]";
	}
	
	
	
	
	
	

}
