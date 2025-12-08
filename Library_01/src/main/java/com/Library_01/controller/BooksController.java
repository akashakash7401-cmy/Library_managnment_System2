package com.Library_01.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Library_01.entity.Book;
import com.Library_01.service.BookService;

	@RestController
	@RequestMapping("/book") 
	public class BooksController {
    @Autowired
	    BookService bookService;
	    @PostMapping("create")
	    public String postStudent(@RequestBody Book book) {
	        return bookService.addBook(book);
	    }

	    // read
	    @GetMapping("find")   // to read all
	    public List<Book>readAll() {
	        return bookService.readAll();
	    }

	    @GetMapping("find/{id}")   // to read by Id
	    public Book readOne(@PathVariable int bookId) {
	        return bookService.readOne(bookId);
	    }

	    // update
	    @PutMapping("update/{id}")
	    public String putBookEntity(@PathVariable int id, @RequestBody Book book) {
	        return bookService.updateBook(id, book);
	    }

	   
	    }
	

