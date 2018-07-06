package com.spring.course.imdb.conf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.actors.GENDER;
import com.spring.course.imdb.dao.ActorsDao;
import com.spring.course.imdb.dao.MovieDao;
import com.spring.course.imdb.ego.EgoMetrics;
import com.spring.course.imdb.movies.GENERE;
import com.spring.course.imdb.movies.Movie;
import com.spring.course.imdb.service.IMDBService;
import com.spring.course.imdb.service.IMDBServiceImpl;



@Configuration
public class IMDBConfiguration {
	
	@Bean
	public EgoMetrics createEgoMetrics(){
		EgoMetrics egoMetrics = new EgoMetrics();
		egoMetrics.addMovie(Aramgaon());
		egoMetrics.addMovie(GivatHalfon());
		return egoMetrics;
		
	}
	

	
	@Bean
    public Actor HaimTupol() {
        Actor haim = new  Actor(1212,"Haim Tupol" ,72,GENDER.MALE);
        haim.setEgoMetrics(createEgoMetrics());
        return haim;
    }
	
	@Bean
    public Actor GilaAlmagor() {
        Actor gila = new Actor(1213,"Gila Almagor" ,75,GENDER.FEMALE);
        gila.setEgoMetrics(createEgoMetrics());
        return gila;
    }
	
	@Bean
    public Movie Aramgaon() {
        return new Movie(2323 , "Armagadon" , GENERE.ACTION , 86);
    }
	
	
	@Bean
    public Movie GivatHalfon() {
        return new Movie(2424 , "Givat Halfon" , GENERE.COMEDY , 95);
    }
	
	@Bean
    public List<Actor> actors() {
		List<Actor> actros = new ArrayList<>();
		actros.add(HaimTupol());
		actros.add(GilaAlmagor());
		return actros;		
      
    }
	
	@Bean
    public Map<Integer,Actor> actorsMap() {
	Map<Integer,Actor> actorsMap =  new HashMap<>();
	actorsMap.put(123 , HaimTupol());
	actorsMap.put(124 , GilaAlmagor());
	return actorsMap;
      
    }
	
	@Bean
    public Map<Integer,Movie> moviesMap() {
	Map<Integer,Movie> moviesMap =  new HashMap<>();
	moviesMap.put(321 , Aramgaon());
	moviesMap.put(322 , GivatHalfon());
	return moviesMap;
      
    }
	
	@Bean
    public ActorsDao actorsDao(){
		return new ActorsDao(actorsMap());
      
    }
	
	@Bean
    public MovieDao moviesDao(){
		return new MovieDao(moviesMap());
      
    }
	
	@Bean
	public IMDBService imdbService(){
		return new IMDBServiceImpl(moviesDao() ,actorsDao());
	}
	


}
