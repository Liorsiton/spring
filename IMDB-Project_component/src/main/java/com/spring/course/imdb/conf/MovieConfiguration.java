package com.spring.course.imdb.conf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.course.imdb.movies.Movie;


@Configuration
@ComponentScan("com.spring.course.imdb.movies.moviesInstance")
public class MovieConfiguration {
	
	 @Autowired
	 private Movie givatHalfon;
	 
	 @Autowired
	 private Movie metzizim;
	 			   
	 
	 @Bean
	 public Map<Integer,Movie> moviesMap(){
		 Map<Integer,Movie> movies = new HashMap<>();
		 movies.put(1, givatHalfon);
		 movies.put(2, metzizim );
		 return movies;
	 }
	

}
