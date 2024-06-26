package com.soten.omdb.domain.model.detail

data class MovieDetailModel(
    val actors: String,
    val awards: String,
    val boxOffice: String,
    val country: String,
    val dvd: String,
    val director: String,
    val genre: String,
    val imdbID: String,
    val imdbRating: String,
    val imdbVotes: String,
    val language: String,
    val metascore: String,
    val plot: String,
    val poster: String,
    val production: String,
    val rated: String,
    val released: String,
    val response: String,
    val runtime: String,
    val title: String,
    val type: String,
    val website: String,
    val writer: String,
    val year: String,
    val ratings: List<RatingModel>
)
