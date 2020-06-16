package com.Ajaksmaniac.dao;
import com.Ajaksmaniac.models.Comment;
import com.Ajaksmaniac.models.Movie;
import com.Ajaksmaniac.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface CommentDao extends CrudRepository<Comment,Integer> {
    @Query(value = "SELECT * FROM resource_table WHERE File_id=?1", nativeQuery = true)
    Comment findResource(Integer i);
}
