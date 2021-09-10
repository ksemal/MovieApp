package com.example.movieapp.domain.usecase

import com.example.movieapp.data.model.movie.Movie
import com.example.movieapp.domain.repository.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}