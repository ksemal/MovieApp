package com.example.movieapp.presentation.di

import com.example.movieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.movieapp.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.example.movieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.example.movieapp.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.example.movieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.movieapp.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Provides
import javax.inject.Singleton

class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}