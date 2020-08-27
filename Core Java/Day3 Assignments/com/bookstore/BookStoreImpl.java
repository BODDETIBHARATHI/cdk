package com.bookstore;

import java.util.Scanner;

import com.book.Book;

public class BookStoreImpl implements BookStore {

	public Book[] getBooks() {

		Book[] b = new Book[5];
		Scanner sc = new Scanner(System.in);
		long isbn;
		String name, publication, author;
		double price;
		System.out.println("Enter the details of the books");
		for (int i = 0; i < 5; i++) {
			System.out.println("Please Enter ISBN of the " + (i + 1) + " book");
			isbn = sc.nextLong();
			System.out.println("Please enter name of the book for ISBN = "+isbn);
			name = sc.next();
			System.out.println("Please enter price of the book for ISBN = "+isbn);
			price = sc.nextDouble();
			System.out.println("Please enter publication of the book for ISBN = "+isbn);
			publication = sc.next();
			System.out.println("Please enter of the author of the the book for ISBN = "+isbn);
			author = sc.next();
			b[i] = new Book(isbn, name, price, publication, author);
			System.out.println("-------------------------------------------");

		}
		return b;
	}

	public Book findBookById(Book[] books, long ID) {
		for (Book b : books) {
			if (b.getIsbn() == ID)
				return b;
		}
		return new Book();
	}

	public Book findBookByName(Book[] books, String name) {
		for (Book b : books) {
			if (b.getName().equals(name))
				return b;
		}
		return new Book();
	}

	public Book updateBook(Book[] books, long ID, double price) {
		for (Book b : books) {
			if (b.getIsbn() == ID) {
				b.setPrice(price);
				return b;
			}
		}
		return new Book();
	}

}
