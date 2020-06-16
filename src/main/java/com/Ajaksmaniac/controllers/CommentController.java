package com.Ajaksmaniac.controllers;

import com.Ajaksmaniac.Services.CommentService;
import com.Ajaksmaniac.Services.MovieService;
import com.Ajaksmaniac.models.AddComment;
import com.Ajaksmaniac.models.Comment;
import com.Ajaksmaniac.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/comments")
@CrossOrigin(origins="http://localhost:3000")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @CrossOrigin(origins="http://localhost:3000")
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public List<Comment> getCommentsByMovieId(@PathVariable Integer id) throws IOException {
        System.out.println(id);
        return commentService.getCommentsByMovieId(id);

    }

    @CrossOrigin(origins="http://localhost:3000")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Comment addComment(@RequestBody AddComment payload) throws IOException {

        System.out.println(payload.toString());
        Integer a = 1;

        return commentService.save(payload);

    }
}
