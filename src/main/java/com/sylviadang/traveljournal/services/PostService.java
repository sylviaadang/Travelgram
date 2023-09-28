package com.sylviadang.traveljournal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylviadang.traveljournal.models.Post;
import com.sylviadang.traveljournal.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public Post getOne(long id) {
		Optional<Post> post = postRepository.findById(id);
		return post.isPresent() ? post.get() : null;
	}
	
	public List<Post> getAll() {
		return (List<Post>) postRepository.findAll();
	}
	
	public Post create(Post post) {
		return postRepository.save(post);
	}
	
	public Post update(Post post) {
		return postRepository.save(post);
	}
	public void delete(Long id) {
		postRepository.deleteById(id);
	}
	
	
}
