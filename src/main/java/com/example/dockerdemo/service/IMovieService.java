package com.example.dockerdemo.service;

import com.example.dockerdemo.controller.model.MovieDto;
import com.example.dockerdemo.model.Movie;
import com.example.dockerdemo.repo.IMovieRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

public interface IMovieService {
    Movie create(Movie movie);
}
