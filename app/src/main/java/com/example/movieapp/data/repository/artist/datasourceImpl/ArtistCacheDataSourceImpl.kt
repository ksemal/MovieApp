package com.example.movieapp.data.repository.artist.datasourceImpl

import com.example.movieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.movieapp.data.model.artist.Artist

class ArtistCacheDataSourceImpl :
    ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
       artistList.clear()
       artistList = ArrayList(artists)
    }
}