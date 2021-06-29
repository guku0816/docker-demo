package com.example.dockerdemo.controller;

import com.example.dockerdemo.controller.model.MovieDto;
import com.example.dockerdemo.model.Movie;
import com.example.dockerdemo.service.IMovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    private final IMovieService iMovieService;

    public MovieController(IMovieService iMovieService){
        this.iMovieService = iMovieService;
    }

    @PostMapping
    public ResponseEntity<MovieDto> createMovie(@RequestBody MovieDto movieDto){
        Movie movie = getMovie(movieDto);
        Movie result = iMovieService.create(movie);

        return new ResponseEntity<>(MovieDto
                                    .builder()
                                    .name(result.getName())
                                    .category(result.getCategory())
                                    .build()
                , HttpStatus.OK);
    }

    public Movie getMovie(MovieDto movieDto){
        return Movie.builder()
                .name(movieDto.getName())
                .category(movieDto.getCategory())
                .build();
    }
}
