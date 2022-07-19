package com.neebal.eKrishak.service.Impl;

import com.neebal.eKrishak.model.post.Post;
import com.neebal.eKrishak.repository.PostRepository;
import com.neebal.eKrishak.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post addPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Set<Post> getPosts() {
        return new LinkedHashSet<>(this.postRepository.findAll());
    }

    @Override
    public Post getPost(Long postId) {
        return this.postRepository.findById(postId).get();
    }

    @Override
    public void deletePost(Long postId) {
        this.postRepository.deleteById(postId);
    }
//
//    @Override
//    public Set<Post> getPostByCategory(Long categoryId) {
//        return this.postRepository.findByCategory(categoryId);
//    }
}
