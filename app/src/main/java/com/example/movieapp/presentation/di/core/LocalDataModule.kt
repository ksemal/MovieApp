package com.example.movieapp.presentation.di.core

import com.example.movieapp.data.db.ArtistDao
import com.example.movieapp.data.db.MovieDao
import com.example.movieapp.data.db.TvShowDao
import com.example.movieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.movieapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.example.movieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.movieapp.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.example.movieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.movieapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}