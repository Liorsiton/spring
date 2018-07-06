package com.spring.course.imdb.movies;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;


public class MovieMapBeanPostProcessor implements BeanPostProcessor{
	
    private static Logger logger = LogManager.getLogger(MovieMapBeanPostProcessor.class);
    private Set<Integer> knownMovieIds;
    
    public MovieMapBeanPostProcessor() {
    	knownMovieIds = new HashSet<>();
    }
    
    
    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof Movie) {

            int movieId = ((Movie)bean).getId();
            logger.info("Bean post processor: Processing movie ID {}..", movieId);
            if (knownMovieIds.contains(movieId)) {
                logger.error("Bean post processor: movie ID {} already exists !", movieId);
            } else {
            	knownMovieIds.add(movieId);
                logger.info("Bean post processor: Accepting movie ID {}.. so far encountered {} movies", movieId, knownMovieIds.size());
            }
        }

        return bean;
    }


}
