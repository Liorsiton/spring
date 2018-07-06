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
public class GivatHalfon extends Movie {

	public GivatHalfon() {
		super(123, "Givat Halfon", GENERE.COMEDY, 75);
		List<Actor> actors = new ArrayList<>();
		EgoMetrics gh = new EgoMetrics();
		gh.addMovie(this);
		Actor shaike = new Actor(223,"Shaike",55,GENDER.MALE);
		shaike.setEgoMetrics(gh);
		Actor poli = new Actor(224,"Poli",55,GENDER.MALE);
		poli.setEgoMetrics(gh);
		Actor gavri = new Actor(225,"Gavri",55,GENDER.MALE);
		gavri.setEgoMetrics(gh);
		actors.add(shaike);
		actors.add(poli);
		actors.add(gavri);
		this.setActors(actors);
		
	}
	
	

}
