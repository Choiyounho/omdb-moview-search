package com.soten.omdb.ui.search.adapter

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter

class MovieLoadStateAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<MovieLoadStateViewHolder>() {

    override fun onBindViewHolder(holder: MovieLoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState, retry)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): MovieLoadStateViewHolder {
        return MovieLoadStateViewHolder.create(parent)
    }
}