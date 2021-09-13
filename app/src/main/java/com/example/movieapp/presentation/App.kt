package com.example.movieapp.presentation

import android.app.Application
import com.example.movieapp.BuildConfig
import com.example.movieapp.Util
import com.example.movieapp.presentation.di.Injector
import com.example.movieapp.presentation.di.artist.ArtistSubComponent
import com.example.movieapp.presentation.di.core.*
import com.example.movieapp.presentation.di.movie.MovieSubComponent
import com.example.movieapp.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {
private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(Util.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY_SECRET))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}