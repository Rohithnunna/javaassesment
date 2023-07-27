package com.pages.PagesPeople.repository;

import com.pages.PagesPeople.models.Post;
import com.pages.PagesPeople.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}