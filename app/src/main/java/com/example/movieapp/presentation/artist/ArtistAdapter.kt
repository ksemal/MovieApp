package com.example.movieapp.presentation.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapp.R
import com.example.movieapp.data.model.artist.Artist
import com.example.movieapp.data.model.tvShow.TvShow
import com.example.movieapp.databinding.ListItemBinding


class ArtistAdapter : RecyclerView.Adapter<MyViewHolder>() {
    private val artistList = ArrayList<Artist>()

    fun setList(artists: List<Artist>) {
        artistList.clear()
        artistList.addAll(artists)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return artistList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(artistList[position])
    }
}


class MyViewHolder(val binding: ListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(artist: Artist) {
        binding.titleTextView.text = artist.name
        val popularity = "Popularity: " + artist.popularity.toString()
        binding.descriptionTextView.text = popularity
        val posterURL = "https://image.tmdb.org/t/p/w500" + artist.profilePath
        Glide.with(binding.imageView.context)
            .load(posterURL)
            .into(binding.imageView)

    }

}