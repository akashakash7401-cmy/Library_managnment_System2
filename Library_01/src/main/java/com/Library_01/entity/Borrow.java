package com.Library_01.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "borrow")

@NoArgsConstructor
@AllArgsConstructor
public class Borrow {

    public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Id         //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //Auto increment
    private int borrowId;
    private Date borrowDate;
    private Date returnDate;
    private Date dueDate;

    @ManyToOne
    @JsonBackReference("book-borrow")
    @JoinColumn(name = "book_id")  //foreign key
    private Book book;	
    @ManyToOne
    @JsonBackReference("borrow-user")
    @JoinColumn(name = "user_id")    // foreign key
    private User user;

//
//public Borrow(int borrowId, Date borrowDate, Date returnDate, Date dueDate, Book book, User users) {
//    super();
//    this.borrowId = borrowId;
//    this.borrowDate = borrowDate;
//    this.returnDate = returnDate;
//    this.dueDate = dueDate;
//    this.book = book;
//    this.user = users;	
}



	// TODO Auto-generated method stub
	



