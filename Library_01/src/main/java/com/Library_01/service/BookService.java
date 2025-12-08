package com.Library_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library_01.entity.Book;
import com.Library_01.respository.BookRespository;

@Service
public class BookService {
@Autowired
  BookRespository bookrep;
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		bookrep.save(book);
		return "Successfully Added Book";
	}

	public List<Book> readAll() {
		// TODO Auto-generated method stub
		return bookrep.findAll();
	}
	public Book readOne(int bookId) {
		// TODO Auto-generated method stub
		return bookrep.findById(bookId).get();
	}

	public String updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		Book existing =bookrep.findById(id).orElse(null);
		if(existing ==null) {
			return "Book not found...!";
		}
		
		existing.setTitle(book.getTitle());
		existing.setAuthor(book.getAuthor());
		existing.setNoOfCopies(book.getNoOfCopies());
		existing.setAvailability(book.getAvailability());
		bookrep.save(existing);
		return "Book updated Sucessfully.!";
	}
	
	

	


}
