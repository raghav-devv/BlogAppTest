package com.example.Post.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Post.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
