package com.example.movieapp.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.movieapp.domain.usecase.GetTvShowsUseCase
import com.example.movieapp.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
): ViewModel() {
    fun getTvShows() = liveData{
        val tvShowsList = getTvShowsUseCase.execute()
        emit(tvShowsList)
    }

    fun updateTvShows() = liveData{
        val tvShowsList = updateTvShowsUseCase.execute()
        emit(tvShowsList)
    }
}