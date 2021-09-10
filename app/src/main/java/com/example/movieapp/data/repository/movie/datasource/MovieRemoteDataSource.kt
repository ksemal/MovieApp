package com.example.movieapp.data.repository.movie.datasource

import com.example.movieapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}