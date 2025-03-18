package com.example.Comment.CommentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Comment.Entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
