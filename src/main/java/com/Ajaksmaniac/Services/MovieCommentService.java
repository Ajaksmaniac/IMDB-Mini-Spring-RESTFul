package com.Ajaksmaniac.Services;

import com.Ajaksmaniac.dao.MovieCommentDao;
import com.Ajaksmaniac.models.Comment;
import com.Ajaksmaniac.models.MovieComment;
import com.Ajaksmaniac.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieCommentService {

    MovieCommentDao movieCommentDao;
    public List<MovieComment> getAllMovieComments(){

        List<MovieComment> movieComments = new ArrayList<>();
        //lambda exp
        movieCommentDao.findAll().forEach(movieComments::add);

        return movieComments;
    }
}
