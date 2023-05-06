package com.example.facebookapi.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.Post;

@Repository

public interface PostRepo extends CrudRepository<Post, Integer> {
	
	Post save(Post post);
	ArrayList<Post> findAll();

}