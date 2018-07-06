package com.spring.course.imdb.movies.moviesInstance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.actors.GENDER;
import com.spring.course.imdb.ego.EgoMetrics;
import com.spring.course.imdb.movies.GENERE;
import com.spring.course.imdb.movies.Movie;

@Component
public class Metzizim extends Movie {
	
	public Metzizim() {
		super(124, "Metzizim", GENERE.COMEDY, 70);
		List<Actor> actors = new ArrayList<>();
		EgoMetrics gh = new EgoMetrics();
		gh.addMovie(this);
		Actor arik = new Actor(226,"Arik",40,GENDER.MALE);
		arik.setEgoMetrics(gh);
		Actor uri = new Actor(227,"Uri",45,GENDER.MALE);
		uri.setEgoMetrics(gh);
		actors.add(arik);	
		actors.add(uri);
		this.setActors(actors);
		
	}

}
