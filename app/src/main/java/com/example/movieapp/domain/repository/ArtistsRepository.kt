package com.example.movieapp.domain.repository

import com.example.movieapp.data.model.artist.Artist
import com.example.movieapp.data.model.tvShow.TvShow

interface ArtistsRepository {
    suspend fun getArtists(): List<Artist>?

    suspend fun updateArtists(): List<Artist>?
}