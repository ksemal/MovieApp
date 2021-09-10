package com.example.movieapp.data.repository

import com.example.movieapp.data.model.movie.Movie
import com.example.movieapp.domain.repository.MovieRepository

class MovieRepositoryImpl: MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }
}