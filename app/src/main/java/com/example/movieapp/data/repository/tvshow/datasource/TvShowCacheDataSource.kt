package com.example.movieapp.data.repository.tvshow.datasource

import com.example.movieapp.data.model.tvShow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}