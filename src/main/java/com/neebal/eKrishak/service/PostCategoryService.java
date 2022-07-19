package com.neebal.eKrishak.service;

import com.neebal.eKrishak.model.post.PostCategory;

import java.util.Set;

public interface PostCategoryService {
    public PostCategory addCategory(PostCategory postCategory);
    public PostCategory updateCategory(PostCategory postCategory);
    public Set<PostCategory> getCategories();
    public PostCategory getCategory(Long categoryId);
    public void deleteCategory(Long categoryId);
}
