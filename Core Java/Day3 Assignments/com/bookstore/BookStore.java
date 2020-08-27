package com.bookstore;

import com.book.Book;

public interface BookStore {
	
	public abstract Book[] getBooks();
	public abstract Book findBookById(Book []books, long ID);
	public abstract Book findBookByName(Book []books , String name);
    public abstract  Book updateBook(Book []books, long ID,double price);
    
    
   public default void display(Book[] books) {
	   
	   for (Book b: books) {
		   System.out.println(b);
		   b.toString();
	   }
    	
    }
	 
	 
}
