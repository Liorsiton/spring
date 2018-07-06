package com.spring.course.imdb.service;

import com.spring.course.imdb.dao.ActorsDao;
import com.spring.course.imdb.dao.MovieDao;

public class IMDBServiceFactory {
	
	private IMDBServiceFactory() {};
	
	public static IMDBServiceFactory getInstnace (){
		return new IMDBServiceFactory();
	}
	
	public  IMDBService obtainService (MovieDao movieDao, ActorsDao actorsDao){
		return new IMDBServiceImpl(movieDao , actorsDao);
	}
	
	
	

}
