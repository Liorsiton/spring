package com.spring.course.imdb.actors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		 ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 IMDBService service = ctx.getBean("IMDBService" , IMDBService.class);
		 service.init();		 
		 logger.info(ctx.getBean("actor1" , Actor.class));
		 logger.info(ctx.getBean("actor2" , Actor.class));
//		 logger.info(ctx.getBean("movie1" , Movie.class));
//		 logger.info(ctx.getBean("movie2" , Movie.class));
//		 logger.info(ctx.getBean("movieDao1" , MovieDao.class));
//		 logger.info(ctx.getBean("actorDao1" , ActorsDao.class));
//		 logger.info(ctx.getBean("IMDBService" , IMDBService.class));
		
		 
		 
		 
	}

}
