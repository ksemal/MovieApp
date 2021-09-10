package com.example.movieapp.domain.usecase

import com.example.movieapp.data.model.artist.Artist
import com.example.movieapp.domain.repository.ArtistsRepository

class GetArtistsUseCase(private val artistsRepository: ArtistsRepository) {
    suspend fun execute(): List<Artist>? = artistsRepository.getArtists()
}