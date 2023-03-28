package com.oliveira.joblisting.repository;

import com.oliveira.joblisting.model.Post;

import java.util.List;


public interface SearchRepository {

    List<Post> findByText(String text);

}
