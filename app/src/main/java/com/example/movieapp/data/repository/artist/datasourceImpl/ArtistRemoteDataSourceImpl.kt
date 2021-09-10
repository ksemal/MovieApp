package com.example.movieapp.data.repository.artist.datasourceImpl

import com.example.movieapp.data.api.TMDBService
import com.example.movieapp.data.model.artist.ArtistList
import com.example.movieapp.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDataSource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

