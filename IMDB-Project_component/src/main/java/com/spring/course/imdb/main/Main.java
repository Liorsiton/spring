package com.spring.course.imdb.main;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.actors.acrtorsInstance.Moni;
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
	                new AnnotationConfigApplicationContext("com.spring.course.conf.SpringConfigFile");
		 
		 logger.debug("====   Starting main work   ====");
		 Moni act = ctx.getBean("Moni", Moni.class);
		 logger.debug(act.getName() + ", " + act.getAge() + " , "  + act.getGender());
		

		
		 
		 
		 
	}

}
