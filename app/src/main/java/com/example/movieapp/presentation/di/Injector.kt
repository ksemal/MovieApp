package com.example.movieapp.presentation.di

import com.example.movieapp.presentation.di.artist.ArtistSubComponent
import com.example.movieapp.presentation.di.movie.MovieSubComponent
import com.example.movieapp.presentation.di.tvshow.TvShowSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent(): ArtistSubComponent
}