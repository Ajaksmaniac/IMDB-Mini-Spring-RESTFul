package com.Ajaksmaniac.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Ajaksmaniac.models.Movie;

public interface MovieDao extends CrudRepository<Movie,Integer> {

@Query(value = "SELECT * FROM resource_table WHERE File_id=?1", nativeQuery = true)
  Movie findResource(Integer i);

}