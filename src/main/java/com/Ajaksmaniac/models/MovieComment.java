package com.Ajaksmaniac.models;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_comment")
public class MovieComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "movie_comment_id")
    private Integer movie_comment_id;

    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "comment_id")
    private Integer comment_id;

    @Column(name = "user_id")
    private int user_id;

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }


    @Override
    public String toString() {
        return "MovieComment{" +
                "comment_id=" + comment_id +
                ", movie_id=" + movie_id +
                ", comment_id=" + comment_id +
                ", user_id=" + user_id +
                '}';
    }
}
