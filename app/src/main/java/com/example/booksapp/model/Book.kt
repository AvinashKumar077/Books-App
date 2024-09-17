package com.example.booksapp.model

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val rating: Double,
    val description: String,
    val imageUrl: String
)
