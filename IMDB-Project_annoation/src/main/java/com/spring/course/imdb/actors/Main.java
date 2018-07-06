package com.spring.course.imdb.actors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.course.imdb.conf.IMDBConfiguration;
import com.spring.course.imdb.dao.ActorsDao;
import com.spring.course.imdb.dao.MovieDao;
import com.spring.course.imdb.ego.EgoMetrics;
import com.spring.course.imdb.movies.Movie;
import com.spring.course.imdb.service.IMDBService;
import com.spring.course.imdb.service.IMDBServiceFactory;





public class Main {
	
	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		
		 logger.debug("====   Starting main work   ====");
//		 ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(IMDBConfiguration.class);
		 IMDBService imdbService = ctx.getBean("imdbService" , IMDBService.class);
		 logger.info(ctx.getBean("moviesDao" , MovieDao.class));
		 logger.info(ctx.getBean("actorsDao" , ActorsDao.class));
		
		 
		 
		 
	}

}
