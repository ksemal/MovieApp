package com.example.movieapp.domain.usecase

import com.example.movieapp.data.model.tvShow.TvShow
import com.example.movieapp.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}