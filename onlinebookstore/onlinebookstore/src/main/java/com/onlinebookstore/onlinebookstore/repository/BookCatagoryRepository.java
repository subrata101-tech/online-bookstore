package com.onlinebookstore.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.onlinebookstore.onlinebookstore.entity.BookCatagory;

@RepositoryRestResource(collectionResourceRel = "bookCatagory",path="book-catagory")
public interface BookCatagoryRepository extends JpaRepository<BookCatagory,Long>
{

}
