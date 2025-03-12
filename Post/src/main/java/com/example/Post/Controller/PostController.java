package com.example.Post.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Post.Entity.Post;
import com.example.Post.Service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

	private final PostService postService;
	
	public PostController(PostService  postService) {
		this.postService=postService;
	}
	
	@PostMapping("/save")
	public Post savePost(@RequestBody Post post) {
		return postService.savePost(post);
	}
	// http://localhost:8080/post/get/{id}
	@GetMapping("/get/{id}")
	public Post getPostById(@PathVariable int id) {
		return postService.getPostById(id);
	}
	
	@PutMapping("/update/{id}")
	public Post updatePost(@PathVariable int id ,@RequestBody Post post) {
		return postService.updateById(id, post);
	}
	@DeleteMapping("/delete/{id}")
	public String deletePost(@PathVariable int id) {
		 postService.deletePost(id);
		 return "post id deleted";
		 
		 
	}
	
}
