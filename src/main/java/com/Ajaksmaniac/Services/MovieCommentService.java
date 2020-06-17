package com.Ajaksmaniac.Services;

import com.Ajaksmaniac.dao.MovieCommentDao;
import com.Ajaksmaniac.models.Comment;
import com.Ajaksmaniac.models.Movie;
import com.Ajaksmaniac.models.MovieComment;
import com.Ajaksmaniac.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieCommentService {
    @Autowired
    MovieCommentDao movieCommentDao;
    public List<MovieComment> getAllMovieComments(){

        List<MovieComment> l =  new ArrayList<>();
        movieCommentDao.findAll().forEach(l::add);

        return l;
    }

    public MovieComment delete(int id){
       List<MovieComment> list = getAllMovieComments();
       for(MovieComment mc : list){
           if(mc.getComment_id() == id){
               MovieComment deletedMovieComment = mc;
                movieCommentDao.delete(mc);
               return mc;
           }
       }
       return  null;
    }
}
