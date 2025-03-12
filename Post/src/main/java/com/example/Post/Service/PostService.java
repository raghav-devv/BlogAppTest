package com.example.Post.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Post.Entity.Post;
import com.example.Post.Repository.PostRepository;

@Service
public class PostService {

	private final PostRepository postRepository;
	
	public PostService(PostRepository postRepository) {
		this.postRepository=postRepository;
	}
	
	public Post savePost(Post post) {
		return postRepository.save(post);
	}
	
	public Post getPostById(int id) {
	    return postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post not found"));
	}

	public List<Post> findAll(){
		return postRepository.findAll();
	}
	
	public Post updateById(int id, Post post) {
		Post p1 = postRepository.findById(id).orElseThrow(()-> new RuntimeException("Post not found"));
		
		p1.setDescription(post.getDescription());
		
		return postRepository.save(p1);
	}
	
	public void deletePost(int id) {
		 postRepository.deleteById(id);
	}
	}
