package com.cl4.cw4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cl4.cw4.model.Book;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class BookController 
{
    public Book book;
    public BookController(Book book)
    {
        this.book=book;
    }
   @GetMapping("/book")
   public Object getMethodName() {
       book.setTitle("The Great Soldier");
       book.setAuthor("G.Gyan");
       LocalDate d=LocalDate.now();
       book.setPub(d);
       return book;
   }
      
}
