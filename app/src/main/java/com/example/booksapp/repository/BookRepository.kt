package com.example.booksapp.repository

import com.example.booksapp.model.Book

class BookRepository {
    private val books = listOf(
        Book(1, "THE SILENT PATIENT", "Alex Michaelides", 4.5, "WITH OVER THREE MILLION COPIES SOLD, read the Sunday Times and No.1 New York Times bestselling, record-breaking thriller that everyone is talking about - soon to be a major film.",
            "https://m.media-amazon.com/images/I/91lslnZ-btL._SY466_.jpg"),
        Book(2, "A Man Called Ove", "Fredrik Backman", 4.6, "The million-copy bestselling phenomenon, Fredrik Backman's heartwarming debut is a funny, moving, uplifting tale of love and community.",
            "https://m.media-amazon.com/images/I/81g2oEdeGTL._SY466_.jpg"),
        Book(3, "A Nation Of Idiots", "Daksh Tyagi", 4.1, "WE INDIANS ARE AN INTERESTING BUNCH. Daksh Tyagi's funny and insightful 'A Nation of Idiots' is the ideal guide to surviving the modern Indian life.",
            "https://cdn.kobo.com/book-images/04905831-4b94-4790-ae28-1675cdb06767/1200/1200/False/a-nation-of-idiots.jpg"),
        Book(4, "The Alchemist", "Paulo Coelho", 4.7, "Paulo Coelho's masterpiece tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure.",
            "https://m.media-amazon.com/images/I/71aFt4+OTOL._SY466_.jpg"),
        Book(5, "Becoming", "Michelle Obama", 4.8, "In a life filled with meaning and accomplishment, Michelle Obama has emerged as one of the most iconic and compelling women of our era.",
            "https://m.media-amazon.com/images/I/81h2gWPTYJL._SY466_.jpg"),
        Book(6, "Educated", "Tara Westover", 4.7, "An unforgettable memoir about a young girl who, kept out of school, leaves her survivalist family and goes on to earn a PhD from Cambridge University.",
            "https://m.media-amazon.com/images/I/81WojUxbbFL._SY466_.jpg"),
        Book(7, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 4.7, "Sapiens takes readers on a breathtaking journey through the history of the human species, from the emergence of Homo sapiens to the twenty-first century.",
            "https://m.media-amazon.com/images/I/713jIoMO3UL._SY466_.jpg"),
        Book(8, "The Power of Habit", "Charles Duhigg", 4.6, "In The Power of Habit, Pulitzer Prize–winning business reporter Charles Duhigg reveals the science behind why habits exist and how they can be changed.",
            "https://m.media-amazon.com/images/I/41IhmDI07KL._SY445_SX342_.jpg"),
        Book(9, "Atomic Habits", "James Clear", 4.8, "Atomic Habits offers a proven framework for improving every day. James Clear is an expert on habit formation, and he reveals practical strategies for how to form good habits.",
            "https://m.media-amazon.com/images/I/91bYsX41DVL._SY466_.jpg"),
        Book(10, "The Subtle Art of Not Giving a F*ck", "Mark Manson", 4.6, "In this generation-defining self-help guide, a superstar blogger cuts through the crap to show us how to stop trying to be 'positive' all the time so that we can truly become better.",
            "https://m.media-amazon.com/images/I/51mN3bY0JjL._SY445_SX342_.jpg"),
        Book(11, "The Catcher in the Rye", "J.D. Salinger", 4.5, "The Catcher in the Rye is the ultimate novel for disaffected youth, but it's relevant to all ages. The novel details two days in the life of 16-year-old Holden Caulfield.",
            "https://m.media-amazon.com/images/I/8125BDk3l9L._SY466_.jpg"),
        Book(12, "1984", "George Orwell", 4.7, "1984 is a dystopian novella by George Orwell published in 1949, which follows the life of Winston Smith, a low ranking member of 'the Party', who is frustrated by the omnipresent eyes of the party.",
            "https://m.media-amazon.com/images/I/513pvzyerWL._SY445_SX342_.jpg"),
        Book(13, "To Kill a Mockingbird", "Harper Lee", 4.9, "Published in 1960, Harper Lee's debut novel To Kill a Mockingbird was an immediate and astonishing success. It won the Pulitzer Prize and quickly became a global phenomenon.",
            "https://m.media-amazon.com/images/I/51Z9p5AecCL._SY445_SX342_.jpg"),
        Book(14, "Pride and Prejudice", "Jane Austen", 4.8, "Pride and Prejudice is a romantic novel of manners written by Jane Austen in 1813. The novel follows the character development of Elizabeth Bennet, the dynamic protagonist.",
            "https://m.media-amazon.com/images/I/41rcZ3XaTQL._SY445_SX342_.jpg"),
        Book(15, "The Great Gatsby", "F. Scott Fitzgerald", 4.6, "The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers.",
            "https://m.media-amazon.com/images/I/41IkR2Ml51L._SY445_SX342_.jpg"),
        Book(16, "The Book Thief", "Markus Zusak", 4.8, "The Book Thief is a novel by Markus Zusak that was first published in 2005. It is about a girl living in Nazi Germany during World War II who steals books to share with others.",
            "https://m.media-amazon.com/images/I/91JGwQlnu7L._SL1500_.jpg"),
        Book(17, "Little Women", "Louisa May Alcott", 4.7, "Little Women is a novel by American author Louisa May Alcott, which was originally published in two volumes in 1868 and 1869. The novel follows the lives of the four March sisters.",
            "https://m.media-amazon.com/images/I/71KztWdDVEL._SY466_.jpg"),
        Book(18, "The Hobbit", "J.R.R. Tolkien", 4.7, "The Hobbit, or There and Back Again is a children's fantasy novel by English author J.R.R. Tolkien. It was published on 21 September 1937 to wide critical acclaim.",
            "https://m.media-amazon.com/images/I/418jD+Rsd5L._SY445_SX342_.jpg"),
        Book(19, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 4.9, "Harry Potter and the Philosopher's Stone is a fantasy novel written by British author J.K. Rowling. The first novel in the Harry Potter series and Rowling's debut novel.",
            "https://m.media-amazon.com/images/I/81YOuOGFCJL._SY466_.jpg"),
        Book(20, "Brave New World", "Aldous Huxley", 4.6, "Brave New World is a dystopian social science fiction novel and prophetic novel written by the English author Aldous Huxley.",
            "https://m.media-amazon.com/images/I/71KilybDOoL._SY466_.jpg"),
        Book(21, "The Kite Runner", "Khaled Hosseini", 4.8, "The unforgettable, heartbreaking story of the unlikely friendship between a wealthy boy and the son of his father's servant, caught in the tragic sweep of history.",
            "https://m.media-amazon.com/images/I/81IzbD2IiIL._SY466_.jpg"),
        Book(22, "The Girl on the Train", "Paula Hawkins", 4.1, "A debut psychological thriller that will forever change the way you look at other people's lives. Nothing is more addicting than The Girl on the Train.",
            "https://m.media-amazon.com/images/I/414+7aha2zL._SY445_SX342_.jpg"),
        Book(23, "The Da Vinci Code", "Dan Brown", 4.7, "While in Paris, Harvard symbologist Robert Langdon is awakened by a phone call in the dead of the night. The elderly curator of the Louvre has been found dead inside the museum.",
            "https://m.media-amazon.com/images/I/71y4X5150dL._SY466_.jpg"),
        Book(24, "Gone Girl", "Gillian Flynn", 4.1, "Marriage can be a real killer. One of the most critically acclaimed suspense writers of our time, New York Times bestseller Gillian Flynn takes that statement to its darkest place.",
            "https://m.media-amazon.com/images/I/41bQ4uhDK1L._SY445_SX342_.jpg"),
        Book(25, "The Fault in Our Stars", "John Green", 4.8, "The Fault in Our Stars is a love story, one of the most genuine and moving ones in recent American fiction, but it’s also an existential tragedy of tremendous intelligence and courage.",
            "https://m.media-amazon.com/images/I/51r27MDeQQL._SY445_SX342_.jpg"),
        Book(26, "The Hunger Games", "Suzanne Collins", 4.7, "In what was once North America, the Capitol of Panem maintains its hold on its 12 districts by forcing them each to send a boy and a girl to compete in the annual Hunger Games.",
            "https://m.media-amazon.com/images/I/41I0GHe7MdL._SY445_SX342_.jpg"),
        Book(27, "Life of Pi", "Yann Martel", 4.6, "Life of Pi is a fantasy adventure novel by Yann Martel published in 2001. The protagonist, Piscine Molitor 'Pi' Patel, a Tamil boy from Pondicherry, explores issues of spirituality and practicality.",
            "https://m.media-amazon.com/images/I/51rxEvLljUL._SY445_SX342_.jpg"),
        Book(28, "Catch-22", "Joseph Heller", 4.3, "Catch-22 is a satirical war novel by American author Joseph Heller. He began writing it in 1953; the novel was first published in 1961.",
            "https://m.media-amazon.com/images/I/51CanUIp3AL._SY445_SX342_.jpg"),
        Book(29, "Crime and Punishment", "Fyodor Dostoevsky", 4.5, "Crime and Punishment is a novel by the Russian author Fyodor Dostoevsky. It was first published in the literary journal The Russian Messenger in twelve monthly installments during 1866.",
            "https://m.media-amazon.com/images/I/31sAHo1LBNL._SY445_SX342_.jpg"),
        Book(30, "War and Peace", "Leo Tolstoy", 4.7, "War and Peace is a novel by the Russian author Leo Tolstoy, published serially, then in its entirety in 1869. It is regarded as one of Tolstoy's finest works and as one of the greatest novels ever written.",
            "https://m.media-amazon.com/images/I/41VkXErPyDL._SY445_SX342_.jpg")
    )


    fun getBooks() = books

    fun getBookById(id: Int): Book? = books.find { it.id == id }
}
