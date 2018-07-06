package com.spring.course.imdb.ego;

import com.spring.course.imdb.movies.Movie;

public class EgoMetrics {
	
	private int totalMovies;
	private double averageMovieRating;
	private double totalRating;
	
	
	public EgoMetrics (){
		this.totalMovies =0;
		this.averageMovieRating = 0;
		this.totalRating = 0;
	}
	
	
	public void addMovie(Movie movie){
		totalMovies++;
		totalRating += movie.getRating()* totalMovies;		
		averageMovieRating =totalRating/totalMovies;	
	}


	public int getTotalMovies() {
		return totalMovies;
	}
	

	public double getAverageMovieRating() {
		return averageMovieRating;
	}


	@Override
	public String toString() {
		return "EgoMetrics [totalMovies=" + totalMovies + ", averageMovieRating=" + averageMovieRating
				+  "]";
	}

	

	
	
	
	

}
