package com.frodo.books;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BooksRepository extends ListCrudRepository<Book, Integer> {
    Collection<Book> findByIsbn(String isbn);
    Collection<Book> findByTitle(String title);
    Collection<Book> findByAuthor(String author);
}