package com.neebal.eKrishak.repository;

import com.neebal.eKrishak.model.post.PostCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCategoryRepo extends JpaRepository<PostCategory, Long> {

}
