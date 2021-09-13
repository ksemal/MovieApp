package com.example.movieapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.movieapp.domain.usecase.GetArtistsUseCase
import com.example.movieapp.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) : ViewModel() {

    fun getArtists() = liveData {
        val artistsList = getArtistsUseCase.execute()
        emit(artistsList)
    }

    fun updateArtists() = liveData {
        val artistsList = updateArtistsUseCase.execute()
        emit(artistsList)
    }
}