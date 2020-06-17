package com.Ajaksmaniac.controllers;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import com.Ajaksmaniac.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.Ajaksmaniac.models.Movie;



@RestController
@RequestMapping(value = "/movies")
@CrossOrigin(origins="http://localhost:3000")
public class MoviesController {

	@Autowired
	private MovieService movieService;
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Movie> getAllMovies() throws IOException {

		return movieService.getAllMovies();
	}

	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public Movie getMovieById(@PathVariable Integer id) throws IOException {
		return movieService.getMovieById(id);

	}

	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping(value = "/name")
	public List<Movie> getMoviesByName(@RequestBody String name) throws IOException {
		if(name.endsWith("=")){
			name = name.substring(0, name.length() - 1);
		}
		System.out.println(name);
		return movieService.getMoviesByName(name);

	}

	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping(value="/add")
	public ResponseEntity<Object> addMovie(@RequestBody Movie movie){
		Movie savedMovie = movieService.save(movie);
		URI location = 
		ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(savedMovie.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@CrossOrigin(origins="http://localhost:3000")
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<Object> deleteMovie(@PathVariable int id){
		Movie savedMovie = movieService.delete(id);
		URI location =
				ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(savedMovie.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}