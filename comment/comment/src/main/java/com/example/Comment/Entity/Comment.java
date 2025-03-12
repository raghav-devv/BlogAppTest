package com.example.Comment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long commentId;
	private String username;
	private String commentDescription;
	private String likes;
	
	private int postId;

}
