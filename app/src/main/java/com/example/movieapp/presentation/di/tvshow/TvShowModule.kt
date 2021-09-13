package com.example.movieapp.presentation.di.tvshow

import com.example.movieapp.domain.usecase.GetTvShowsUseCase
import com.example.movieapp.domain.usecase.UpdateTvShowsUseCase
import com.example.movieapp.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}