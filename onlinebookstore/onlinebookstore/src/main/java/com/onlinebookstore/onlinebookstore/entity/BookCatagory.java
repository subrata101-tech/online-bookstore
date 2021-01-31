package com.onlinebookstore.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BookCatagory
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "catagory")
	private Set<Book>book;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookCatagory [id=" + id + ", book=" + book + "]";
	}
	public BookCatagory(Long id, Set<Book> book) {
		super();
		this.id = id;
		this.book = book;
	}
	public BookCatagory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
