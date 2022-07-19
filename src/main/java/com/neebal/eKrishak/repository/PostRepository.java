package com.neebal.eKrishak.repository;

import com.neebal.eKrishak.model.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PostRepository extends JpaRepository<Post, Long> {

//    Set<Post> findByCategory(Long categoryId);
}
