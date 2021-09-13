package com.example.movieapp.presentation.di.artist

import com.example.movieapp.domain.usecase.GetArtistsUseCase
import com.example.movieapp.domain.usecase.UpdateArtistsUseCase
import com.example.movieapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistsUseCase)
    }
}