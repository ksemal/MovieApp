package com.example.movieapp.presentation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.movieapp.R
import com.example.movieapp.databinding.ActivityHomeBinding
import com.example.movieapp.presentation.artist.ArtistActivity
import com.example.movieapp.presentation.movie.MovieActivity
import com.example.movieapp.presentation.tvshow.TvShowActivity

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding.movieBtn.setOnClickListener(this)
        binding.tvShowBtn.setOnClickListener(this)
        binding.artistBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent: Intent = when (v?.id) {
            binding.movieBtn.id -> {
                Intent(this, MovieActivity::class.java)
            }
            binding.tvShowBtn.id -> {
                Intent(this, TvShowActivity::class.java)
            }
            binding.artistBtn.id -> {
                Intent(this, ArtistActivity::class.java)
            }
            else -> return
        }
        startActivity(intent)
    }
}