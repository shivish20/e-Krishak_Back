package com.neebal.eKrishak.service.Impl;

import com.neebal.eKrishak.model.post.PostCategory;
import com.neebal.eKrishak.repository.PostCategoryRepo;
import com.neebal.eKrishak.service.PostCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class PostCategoryServiceImpl implements PostCategoryService {

   @Autowired
   private PostCategoryRepo postCategoryRepo;

    @Override
    public PostCategory addCategory(PostCategory postCategory) {
        return this.postCategoryRepo.save(postCategory);
//        return null;
    }

    @Override
    public PostCategory updateCategory(PostCategory postCategory) {
        return this.postCategoryRepo.save(postCategory);
    }

    @Override
    public Set<PostCategory> getCategories() {
        return new LinkedHashSet<>( this.postCategoryRepo.findAll());
    }

    @Override
    public PostCategory getCategory(Long categoryId) {
        return this.postCategoryRepo.findById(categoryId).get();
    }

    @Override
    public void deleteCategory(Long categoryId) {
        PostCategory postCategory=new PostCategory();
        postCategory.setCategoryId(categoryId);
        this.postCategoryRepo.delete(postCategory);
    }
}
