package com.neebal.eKrishak.service;

import com.neebal.eKrishak.model.post.Post;

import java.util.Set;

public interface PostService {
    public Post addPost(Post post);
    public Post updatePost(Post post);
    public Set<Post> getPosts();
    public Post getPost(Long postId);
    public void deletePost(Long postId);
//    public Set<Post> getPostByCategory(Long categoryId);
}
