package com.example.movieapp.data.repository.movie.datasourceimpl

import com.example.movieapp.data.db.MovieDao
import com.example.movieapp.data.model.movie.Movie
import com.example.movieapp.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    // room get data in background thread by default but other query needs to be specified to run on a background thread
    override suspend fun getMoviesFromDB(): List<Movie> = movieDao.getMovies()


    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}