package com.example.booksapp.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.booksapp.viewmodel.BookViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookListScreen(navController: NavController, viewModel: BookViewModel) {
    val booksState = viewModel.bookList.collectAsState()
    val books = booksState.value

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "MyBooks", fontWeight = FontWeight.Bold)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xffedf2fb)
                )
            )
        },
        content = { paddingValues ->
            if (books.isEmpty()) {
                // Show a loading indicator or empty state message
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = "No books available", style = MaterialTheme.typography.bodyMedium)
                }
            } else {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2), // Two books per row
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues) // Padding from the Scaffold
                        .padding(8.dp) // Adjusted padding
                ) {
                    items(items = books, key = { it.id }) { book ->
                        BookItem(book) {
                            navController.navigate("bookDetails/${book.id}")
                        }
                    }
                }
            }
        }
    )
}

