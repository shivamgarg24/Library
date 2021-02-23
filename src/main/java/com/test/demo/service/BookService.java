package com.test.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.model.Book;
import com.test.demo.model.College;
import com.test.demo.repo.CollegeRepository;
import com.test.demo.repo.BookRepository;
 
@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	public List<Book>getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book addBook(Book book) {
		College college = collegeRepository.findById(book.getCollege().getId()).orElse(null);
		if(null==college) {
			college = new College();
		}
		college.setCollege_name(book.getCollege().getCollege_name());
        book.setCollege(college);
        return bookRepository.save(book);
	}
	
	 public Book editBooks(Book book) {
		 
	        return bookRepository.save(book);
	    }
	 
	    public void deleteBooks(Integer id) {
	 
	        bookRepository.deleteById(id);
	    }
	

}