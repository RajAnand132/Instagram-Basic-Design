package com.projectRaj.InstagramBasicDesign.repo;

import com.projectRaj.InstagramBasicDesign.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

}
