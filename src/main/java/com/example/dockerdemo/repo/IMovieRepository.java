package com.example.dockerdemo.repo;

import com.example.dockerdemo.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends CrudRepository<Movie, String> {
}
