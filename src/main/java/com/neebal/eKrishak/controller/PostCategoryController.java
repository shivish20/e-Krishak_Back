package com.neebal.eKrishak.controller;

import com.neebal.eKrishak.model.post.PostCategory;
import com.neebal.eKrishak.service.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class PostCategoryController {
    @Autowired
    private PostCategoryService postCategoryService;

    //add category
    @PostMapping("/")
    public ResponseEntity<PostCategory> addCategory(@RequestBody PostCategory postCategory){
        return ResponseEntity.ok(this.postCategoryService.addCategory(postCategory));
    }

    //get Category
    @GetMapping("/{categoryId}")
    public ResponseEntity<PostCategory> getCategory(@PathVariable("categoryId") Long categoryId){
        return ResponseEntity.ok(this.postCategoryService.getCategory(categoryId));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllCategories(){
        return  ResponseEntity.ok(this.postCategoryService.getCategories());
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateCategory(@RequestBody PostCategory postCategory){
        return ResponseEntity.ok(this.postCategoryService.updateCategory(postCategory));
    }
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId){
         this.postCategoryService.deleteCategory(categoryId);
    }
}
