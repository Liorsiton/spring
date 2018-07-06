package com.spring.course.imdb.dao;

import java.util.Map;

import com.spring.course.imdb.actors.Actor;



public class ActorsDao {
	
	private Map<Integer,Actor> actors ;
	

	public ActorsDao(Map<Integer, Actor> actors) {		
		this.actors = actors;
	}


	@Override
	public String toString() {
		return "ActorsDao [actors=" + actors + "]";
	}
	
	public Map<Integer,Actor> getActors(){
		return actors;
	}
	
	
	
	
	
	

}
