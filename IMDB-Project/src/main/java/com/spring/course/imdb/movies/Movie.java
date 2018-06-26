package com.spring.course.imdb.movies;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.spring.course.imdb.actors.Actor;

public class Movie {
	
	private int id;
	private String name;
	private GENERE genere;
	private List<Actor> actors = new ArrayList<>();
	//private Actor mainActor;
	//private Actor secondaryActor;
	
	
	public Movie(int id, String name, GENERE genere) {
		
		this.id = id;
		this.name = name;
		this.genere = genere;
	}


	public List<Actor> getActors() {
		return actors;
	}


	public void setActors(List actors) {
		this.actors = actors;
	}


	


	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genere=" + genere + ", actors=" + actors + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

	
	
	
	
	

}
