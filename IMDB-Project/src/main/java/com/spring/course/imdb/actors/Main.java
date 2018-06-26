package com.spring.course.imdb.actors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.course.imdb.movies.Movie;
import com.spring.course.imdb.movies.dao.MovieDao;



public class Main {
	
	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		
		
		 ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 logger.debug("====   Starting main work   ====");
		 logger.info(ctx.getBean("actor1" , Actor.class));
		 logger.info(ctx.getBean("movie1" , Movie.class));
		// logger.info(ctx.getBean("movie2" , Movie.class));
		 logger.info(ctx.getBean("movieDao1" , MovieDao.class));
		 
	}

}
