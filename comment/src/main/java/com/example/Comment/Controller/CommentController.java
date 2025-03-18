package com.example.Comment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Comment.Entity.Comment;
import com.example.Comment.Service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
//	http://localhost:8081/comment/save
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/save")
	public Comment saveComment(@RequestBody Comment comment ) {
		return commentService.saveComment(comment);
	}
	
	@GetMapping("/get/{id}")
	public Comment getComment(@PathVariable Long id) {
		return commentService.getCommentById(id);
	}

}
