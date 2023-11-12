package com.frodo.books;

import org.springframework.data.annotation.Id;

public record Book(@Id Integer id, String isbn, String title, String author) {
}
