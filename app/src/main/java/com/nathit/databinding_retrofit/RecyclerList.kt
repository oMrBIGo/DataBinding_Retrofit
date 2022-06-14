package com.nathit.databinding_retrofit

data class RecyclerList(val items: ArrayList<RecyclerData>)
data class RecyclerData(
    val name: String,
    val description: String,
    val created_at: String,
    val owner: Owner,
    val html_url: String
)

data class Owner(
    val avatar_url: String)
