package com.example.fireAuth_REST_API.repository;

import com.example.fireAuth_REST_API.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
