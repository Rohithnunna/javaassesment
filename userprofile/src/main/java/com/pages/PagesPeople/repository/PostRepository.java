package com.pages.userprofile.repository;

import com.pages.userprofile.models.Post;
import com.pages.userprofile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}