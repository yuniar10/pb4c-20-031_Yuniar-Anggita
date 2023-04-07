package com.example.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class secondActivity : AppCompatActivity() {
    private var recyclerView : RecyclerView?=null
    private var recyclerViewMovieAdapter : RecyclerViewMovieAdapter? = null
    private var movielist = mutableListOf<Movie>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        movielist = ArrayList()

        recyclerView = findViewById<View>(R.id.rvMovieList) as RecyclerView
        recyclerViewMovieAdapter = RecyclerViewMovieAdapter(this@secondActivity, movielist)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewMovieAdapter
        prepareMovieListData()
    }

    private fun prepareMovieListData() {
       var movie = Movie("Jalan Yang Jauh Jangan Lupa Pulang", R.drawable.film1)
        movielist.add(movie)
        movie = Movie("Khanzab", R.drawable.film2)
        movielist.add(movie)
        movie = Movie("Waktu Maghrib", R.drawable.film3)
        movielist.add(movie)
        movie = Movie("Kajiman", R.drawable.film4)
        movielist.add(movie)
        movie = Movie("Jalan Yang Jauh Jangan Lupa Pulang", R.drawable.film1)
        movielist.add(movie)
        movie = Movie("Khanzab", R.drawable.film2)
        movielist.add(movie)
        movie = Movie("Waktu Maghrib", R.drawable.film3)
        movielist.add(movie)
        movie = Movie("Kajiman", R.drawable.film4)
        movielist.add(movie)
        movie = Movie("Jalan Yang Jauh Jangan Lupa Pulang", R.drawable.film1)
        movielist.add(movie)
        movie = Movie("Khanzab", R.drawable.film2)
        movielist.add(movie)
        movie = Movie("Waktu Maghrib", R.drawable.film3)
        movielist.add(movie)
        movie = Movie("Kajiman", R.drawable.film4)
        movielist.add(movie)
        movie = Movie("Jalan Yang Jauh Jangan Lupa Pulang", R.drawable.film1)
        movielist.add(movie)
        movie = Movie("Khanzab", R.drawable.film2)
        movielist.add(movie)
        movie = Movie("Waktu Maghrib", R.drawable.film3)
        movielist.add(movie)
        movie = Movie("Kajiman", R.drawable.film4)
        movielist.add(movie)

        recyclerViewMovieAdapter!!.notifyDataSetChanged()
    }
}