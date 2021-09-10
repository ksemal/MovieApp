package com.example.movieapp.data.repository.artist.datasource

import com.example.movieapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
   suspend fun getArtists(): Response<ArtistList>
}