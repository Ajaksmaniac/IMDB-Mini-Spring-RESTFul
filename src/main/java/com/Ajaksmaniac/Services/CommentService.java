package com.Ajaksmaniac.Services;

import com.Ajaksmaniac.dao.CommentDao;
import com.Ajaksmaniac.dao.MovieCommentDao;
import com.Ajaksmaniac.dao.UserDao;
import com.Ajaksmaniac.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;
    @Autowired
    UserDao userDao;
    @Autowired
    private MovieCommentDao movieCommentDao;
    @Autowired
    UserService userService;

    public List<Comment> getAllComments(){

        List<Comment> comments = new ArrayList<>();
        commentDao.findAll().forEach(comments::add);

        return comments;
    }
    public Comment getCommentById(Integer id) {

        return commentDao.findById(id).orElse(new Comment());
    }
    public Comment save(Comment comment) {
        commentDao.save(comment);
        return comment;

    }
    public List<Comment> getCommentsByMovieId( int id){
       List<MovieComment> l =  new ArrayList<>();
       movieCommentDao.findAll().forEach(l::add);
       List<Comment> comments = new ArrayList<>();
       for(MovieComment mc : l){
           if(mc.getMovie_id() == id){

               Comment comment =  getCommentById(mc.getComment_id());
               User u = userService.getUserById(mc.getUser_id());
                comment.setCommentedBy(u.getUsername());
               System.out.println(comment.toString());
               comments.add(comment);
           }
       }
       return comments;
    }

    public Comment save(AddComment c) {
        Comment newComment = new Comment();
        newComment.setText(c.getText());
        newComment.setUser_id(c.getUser_id());
        newComment.setDate_posted(new Date());

        Integer id =commentDao.save(newComment).getComment_id();
        MovieComment newMovieComment = new MovieComment();
        newMovieComment.setMovie_id(c.getMovie_id());
        newMovieComment.setComment_id(id);
        newMovieComment.setUser_id(c.getUser_id());

        movieCommentDao.save(newMovieComment);
        return newComment;

    }
}
