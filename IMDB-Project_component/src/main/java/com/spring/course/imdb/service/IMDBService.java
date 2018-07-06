package com.spring.course.imdb.service;

import java.util.List;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.movies.Movie;

public interface IMDBService {
	
	int totaldefinedMovies();
	int totalDefinedActors();
	List<Actor> getActorsOfMovie(int movieID);
	List<Movie> getAllMoviesForActor(int actorID);
	void init();




}
