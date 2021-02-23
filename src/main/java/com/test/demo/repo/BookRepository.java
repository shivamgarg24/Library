package com.test.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.demo.model.Book;

public interface BookRepository extends JpaRepository<Book , Integer> {

}