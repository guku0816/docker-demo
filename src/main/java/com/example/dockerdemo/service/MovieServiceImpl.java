package com.example.dockerdemo.service;

import com.example.dockerdemo.model.Movie;
import com.example.dockerdemo.repo.IMovieRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MovieServiceImpl implements IMovieService{
    private final IMovieRepository iMovieRepository;

    public MovieServiceImpl(IMovieRepository iMovieRepository){
        this.iMovieRepository = iMovieRepository;
    }

    public Movie create(Movie movie){
        Date date = new Date();
        movie.setCreatedDate(date);
        movie.setUpdatedDate(date);
        Movie result = iMovieRepository.save(movie);

        return  result;
    }
}
