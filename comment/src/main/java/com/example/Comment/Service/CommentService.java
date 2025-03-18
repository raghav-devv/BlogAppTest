package com.example.Comment.Service;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.example.Comment.CommentRepository.CommentRepository;
import com.example.Comment.Entity.Comment;
import com.example.Comment.Entity.Post;

@Service
public class CommentService {

	private final RestTemplate restTemplate;
	private final CommentRepository commentRepository;
	
	public CommentService(CommentRepository commentRepository,RestTemplate restTemplate) {
		this.commentRepository=commentRepository;
		this.restTemplate=restTemplate;
	}
	
	public Comment saveComment(Comment comment) {
		Post post = restTemplate.getForObject("http://localhost:8080/post/get/"+comment.getPostId(), Post.class);
		
		if(post!= null) {
			Comment savedComment = commentRepository.save(comment);
			return savedComment;
		}else {
			return null;
		}
	}

	public Comment getCommentById(Long id) {
		return commentRepository.findById(id).orElseThrow(()-> new RuntimeException("comment didnot found"));
	}
	
}
