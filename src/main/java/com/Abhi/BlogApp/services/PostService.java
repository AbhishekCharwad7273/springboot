package com.Abhi.BlogApp.services;

import java.util.List;

import com.Abhi.BlogApp.payloads.PostDto;
import com.Abhi.BlogApp.payloads.PostResponse;

public interface PostService {
	
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId );
	
	//update
	 
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//get all post
	
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//getSinglePost
	
	PostDto getPostById(Integer postId);
	
	//get All Posts By category
	
	List<PostDto>getPostsByCategory(Integer categoryId);
	
	//get All posts By User
	
	List<PostDto>getPostsByUser(Integer userId);
	
	//search posts
	
	List<PostDto>searchPosts(String keyword);
	
	
}
