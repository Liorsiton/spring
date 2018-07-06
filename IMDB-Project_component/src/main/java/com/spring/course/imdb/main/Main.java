package com.spring.course.imdb.main;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.course.imdb.conf.MovieConfiguration;
import com.spring.course.imdb.dao.ActorsDao;
import com.spring.course.imdb.dao.MovieDao;
import com.spring.course.imdb.ego.EgoMetrics;
import com.spring.course.imdb.movies.Movie;
import com.spring.course.imdb.service.IMDBService;
import com.spring.course.imdb.service.IMDBServiceFactory;







public class Main {
	
	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		
		 
		 AnnotationConfigApplicationContext ctx =
	                new AnnotationConfigApplicationContext(MovieConfiguration.class);
		 
		 logger.debug("====   Starting main work   ====");
		 Map<Integer, Movie> movieMap = ctx.getBean("moviesMap", Map.class);		 
		 movieMap.forEach( (id, movie) -> {	           
	            logger.info("movie with id {} and name {} has rating of {} and the actors are: {}", id,movie.getName() , movie.getRating(), movie.getActors());
	        });

		
		 
		 
		 
	}

}
