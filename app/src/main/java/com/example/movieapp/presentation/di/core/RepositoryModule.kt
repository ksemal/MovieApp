package com.example.movieapp.presentation.di.core

import com.example.movieapp.data.repository.artist.ArtistRepositoryImpl
import com.example.movieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.movieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.movieapp.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.movieapp.data.repository.movie.MovieRepositoryImpl
import com.example.movieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.example.movieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.movieapp.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.movieapp.data.repository.tvshow.TvShowRepositoryImpl
import com.example.movieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.movieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.movieapp.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.movieapp.domain.repository.ArtistsRepository
import com.example.movieapp.domain.repository.MovieRepository
import com.example.movieapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistsRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource)
    }
}