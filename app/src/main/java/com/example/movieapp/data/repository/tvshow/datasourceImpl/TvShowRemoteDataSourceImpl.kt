package com.example.movieapp.data.repository.tvshow.datasourceImpl


import com.example.movieapp.data.api.TMDBService
import com.example.movieapp.data.model.tvShow.TvShowList
import com.example.movieapp.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDataSource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

