package com.spring.course.imdb.service;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.dao.ActorsDao;
import com.spring.course.imdb.dao.MovieDao;
import com.spring.course.imdb.ego.EgoMetrics;
import com.spring.course.imdb.movies.Movie;

public class IMDBServiceImpl  implements IMDBService {
	
	private MovieDao movieDao;
	private ActorsDao actorsDao;

	

	public IMDBServiceImpl(MovieDao movieDao, ActorsDao actorsDao) {		
		this.movieDao = movieDao;
		this.actorsDao = actorsDao;
	}
	

	@Override
	public int totaldefinedMovies() {
		return 0;
		
	}

	@Override
	public int totalDefinedActors() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Actor> getActorsOfMovie(int movieID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllMoviesForActor(int actorID) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "IMDBServiceImpl [movieDao=" + movieDao + ", actorsDao=" + actorsDao + "]";
	}


	@Override
	public void init() {
	EgoMetrics em = new EgoMetrics();	
	Map<Integer,Movie> movies =	movieDao.getMovies();
	for(Map.Entry<Integer,Movie> entry : movies.entrySet()){
		Movie movie = entry.getValue();
		em.addMovie(movie);
		List<Actor> actors = entry.getValue().getActors();
		for(Actor actor : actors){
			actor.setEgoMetrics(em);
		}
		
	}
		
	}
	
	

}
