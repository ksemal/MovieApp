package com.example.movieapp.data.repository.artist.datasource

import com.example.movieapp.data.model.artist.Artist


interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)

}