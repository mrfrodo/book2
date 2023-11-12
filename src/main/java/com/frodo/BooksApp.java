package com.frodo;

import com.frodo.books.Book;
import com.frodo.books.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooksApp {
	public static void main(String[] args) {
		SpringApplication.run(BooksApp.class, args);
	}

	@Bean
	CommandLineRunner clr (BooksRepository repository) {
		return args -> {
			repository.save(new Book(null, "9912-12", "the bobbitees", "tolkien"));
			repository.save(new Book(null, "12212-1223", "the lords", "tolkien"));
		};
	}
}
