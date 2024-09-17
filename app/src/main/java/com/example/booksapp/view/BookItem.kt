package com.example.booksapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.booksapp.R
import com.example.booksapp.model.Book


val MyCustomFontFamily = FontFamily(
    Font(R.font.sf_pro_display_bold, FontWeight.Normal)
)
@Composable
fun BookItem(book: Book, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(8.dp)
            .clickable(
                onClick = onClick,
                indication = rememberRipple(bounded = true), // Ripple effect
                interactionSource = remember { MutableInteractionSource() }
            )
            .width(160.dp) // Adjust the width as per design
    ) {
        // Card with elevation for the book image
        Card(
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(4.dp), // Reduced elevation for better performance
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(3f / 4f) // Adjust the aspect ratio as needed
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                // Book image with rounded corners and placeholders
                Image(
                    painter = rememberAsyncImagePainter(
                        model = book.imageUrl,
                        placeholder = painterResource(R.drawable.placeholder), // Replace with your placeholder drawable
                        error = painterResource(R.drawable.error) // Replace with your error drawable
                    ),
                    contentDescription = "${book.title} cover image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                // Rating box at the top-right corner
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .clip(CircleShape)
                        .background(color = Color.Yellow)
                        .padding(4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating Star",
                            tint = MaterialTheme.colorScheme.secondary,
                            modifier = Modifier.size(12.dp)
                        )
                        Text(
                            text = book.rating.toString(),
                            style = MaterialTheme.typography.bodySmall,
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
        }

        // Space between image and title/author
        Spacer(modifier = Modifier.height(8.dp))

        // Book title
        Text(
            text = book.title,
            style = MaterialTheme.typography.titleMedium.copy(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = MyCustomFontFamily
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 4.dp) // Padding to prevent text from clipping
        )

        // Book author
        Text(
            text = book.author,
            style = MaterialTheme.typography.bodySmall.copy(fontSize = 14.sp),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 4.dp)
        )
    }
}

