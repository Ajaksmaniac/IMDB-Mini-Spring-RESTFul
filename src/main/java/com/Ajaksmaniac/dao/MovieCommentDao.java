package com.Ajaksmaniac.dao;
import com.Ajaksmaniac.models.Comment;
import com.Ajaksmaniac.models.Movie;
import com.Ajaksmaniac.models.MovieComment;
import com.Ajaksmaniac.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface MovieCommentDao extends CrudRepository<MovieComment,Integer> {
    @Query(value = "SELECT * FROM resource_table WHERE File_id=?1", nativeQuery = true)
    MovieComment findResource(Integer i);
}
