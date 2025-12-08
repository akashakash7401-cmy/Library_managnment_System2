package com.Library_01.entity;					

//package com.libray.Libray_01_Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "book")

public class Book {

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfCopies() {
		return No_of_Copies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.No_of_Copies = noOfCopies;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public List<Borrow> getBorrow() {
		return borrow;
	}

	public void setBorrow(List<Borrow> borrow) {
		this.borrow = borrow;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String author;

    private int No_of_Copies;

    private boolean availability;

    @OneToMany(mappedBy = "book",cascade=CascadeType.ALL)
    @JsonManagedReference("book-Borrow")
    private List<Borrow> borrow;
    
    
}


