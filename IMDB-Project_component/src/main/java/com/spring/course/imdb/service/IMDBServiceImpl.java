package com.spring.course.imdb.service;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.dao.ActorsDao;
import com.spring.course.imdb.dao.MovieDao;
import com.spring.course.imdb.ego.EgoMetrics;
import com.spring.course.imdb.main.Main;
import com.spring.course.imdb.movies.Movie;


public class IMDBServiceImpl  implements IMDBService {
	
	private static Logger logger = LogManager.getLogger(IMDBServiceImpl.class);
	
	private MovieDao movieDao;
	private ActorsDao actorsDao;

	

	public IMDBServiceImpl(MovieDao movieDao, ActorsDao actorsDao) {		
		this.movieDao = movieDao;
		this.actorsDao = actorsDao;
	}
	

	@Override
	public int totaldefinedMovies() {
		return movieDao.getMovies().size();
		
	}

	@Override
	public int totalDefinedActors() {
		return actorsDao.getActors().size();
	}

	@Override
	public List<Actor> getActorsOfMovie(int movieID) {
		List<Actor> actors = null;
		Map<Integer , Movie> movies = movieDao.getMovies();
		for(Map.Entry<Integer, Movie> entry : movies.entrySet()){
			Movie movie = entry.getValue();
			if(movie.getId() == movieID){
				actors = movie.getActors();
			}
		}
		return actors;
	}

	@Override
	public List<Movie> getAllMoviesForActor(int actorID) {
		List<Movie> moviesToReturn = null;
		Map<Integer , Movie> movies = movieDao.getMovies();
		for(Map.Entry<Integer, Movie> entry : movies.entrySet()){
			Movie movie = entry.getValue();
			for(Actor actor : movie.getActors()){
				if(actor.getId()==actorID){
					moviesToReturn.add(movie);
				}
			}
		}
		return moviesToReturn;
		
	}


	@Override
	public String toString() {
		return "IMDBServiceImpl [movieDao=" + movieDao + ", actorsDao=" + actorsDao + "]";
	}


	@Override
	@PostConstruct
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
	@PreDestroy 
	public void destroy(){
		logger.info("destroy");
		
	}
	
	

}
