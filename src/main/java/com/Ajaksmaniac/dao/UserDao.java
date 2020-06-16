package com.Ajaksmaniac.dao;

import com.Ajaksmaniac.models.Movie;
import com.Ajaksmaniac.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {
    @Query(value = "SELECT * FROM resource_table WHERE File_id=?1", nativeQuery = true)


    User findResource(Integer i);
}
