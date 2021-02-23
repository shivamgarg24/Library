package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.test.demo.service.BookService;
import com.test.demo.model.Book;

	@RestController
	public class BookController{
		
		 @Autowired
		    private BookService bookService;
		 
		    @GetMapping("/get-books")
		    public ResponseEntity<List<Book>> getAllBooks() {
		 
		        List<Book> books = bookService.getAllBooks();
		        return new ResponseEntity<>(books, HttpStatus.OK);
		    }
		 
		    @PostMapping("/book")
		    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		 
		        Book b = bookService.addBook(book);
		        return new ResponseEntity<>(b, HttpStatus.OK);
		    }
		 
		    @PutMapping("/book")
		    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
		 
		        Book b = bookService.editBooks(book);
		        return new ResponseEntity<>(b, HttpStatus.OK);
		    }
		 
		    @DeleteMapping("/book")
		    public ResponseEntity<String> deleteBook(@RequestParam(name = "bookId") Integer bookId) {
		 
		        bookService.deleteBooks(bookId);
		        return new ResponseEntity<>("Book with ID :" + bookId + " deleted successfully", HttpStatus.OK);
		    }
		}