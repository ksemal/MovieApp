package com.example.movieapp.presentation.di

import com.example.movieapp.data.api.TMDBService
import com.example.movieapp.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.movieapp.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.movieapp.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.movieapp.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.example.movieapp.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.movieapp.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }
}