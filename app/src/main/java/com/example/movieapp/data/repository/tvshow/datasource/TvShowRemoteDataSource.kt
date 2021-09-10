package com.example.movieapp.data.repository.tvshow.datasource


import com.example.movieapp.data.model.tvShow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
   suspend fun getTvShows(): Response<TvShowList>
}