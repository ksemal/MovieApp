package com.example.movieapp.presentation.di.core

import com.example.movieapp.presentation.di.artist.ArtistSubComponent
import com.example.movieapp.presentation.di.movie.MovieSubComponent
import com.example.movieapp.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory
}