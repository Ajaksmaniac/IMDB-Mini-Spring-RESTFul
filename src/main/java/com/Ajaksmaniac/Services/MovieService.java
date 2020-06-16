package com.Ajaksmaniac.Services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Ajaksmaniac.dao.MovieDao;
import com.Ajaksmaniac.models.Movie;

@Service

public class MovieService {

	@Autowired
	private MovieDao movieDao;

	public List<Movie> getAllMovies(){

		List<Movie> movies = new ArrayList<>();
		movieDao.findAll().forEach(movies::add);
	
    	return movies;
	}

	public Movie getMovieById(Integer id) {

  		return movieDao.findById(id).orElse(new Movie());
	}
	public List<Movie> getMoviesByName(String name) {

		List<Movie> movies = new ArrayList<>();
		List<Movie> list = getAllMovies();
		for(Movie movie : list){
			System.out.println(name);
			if(movie.getName().startsWith(name)){

				System.out.println(movie.getName());
				movies.add(movie);
			}else if(movie.getName().equals(name)){
				System.out.println(movie.getName());
				movies.add(movie);
			}else if(movie.getName().endsWith(name)){
				System.out.println(movie.getName());
				movies.add(movie);
			}
		}

		return movies;
	}


	public Movie save(Movie movie) {
		movieDao.save(movie);
		return movie;
	
	}

}