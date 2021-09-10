package com.example.movieapp.data.repository.tvshow.datasource

import com.example.movieapp.data.model.tvShow.TvShow


interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}