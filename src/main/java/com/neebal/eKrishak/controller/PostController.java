package com.neebal.eKrishak.controller;

import com.neebal.eKrishak.model.post.Post;
import com.neebal.eKrishak.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
public class PostController {
    @Autowired
    private PostService postService;

    //add category
    @PostMapping("/")
    public ResponseEntity<Post> addPost(@RequestBody Post post){
        return ResponseEntity.ok(this.postService.addPost(post));
    }

    //get post
    @GetMapping("/{postId}")
    public ResponseEntity<Post> getPost(@PathVariable("postId") Long postId){
        return ResponseEntity.ok(this.postService.getPost(postId));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllPosts(){
        return ResponseEntity.ok(this.postService.getPosts());
    }
    @PutMapping("/update")
    public ResponseEntity<?> updatePost(@RequestBody Post post){
        return ResponseEntity.ok(this.postService.updatePost(post));
    }
    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable("categoryId") Long postId){
        this.postService.deletePost(postId);
    }

}
