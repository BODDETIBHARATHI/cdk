package com.book;


public class Book {

	private long isbn;
	private String name;
	private double price;
	private String publication;
	private String author;
	
//	a default constructor
	public Book() {
		
	}
//	parameterised constaructor having ISBN,name,price
	public Book(long isbn, String name, double price) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}
//	parameterised constaructor having ISBN,name,publication,author
	public Book(long isbn, String name, String publication, String author) {
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.author = author;
	}
	public Book(long isbn, String name, double price, String publication, String author) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.publication = publication;
		this.author = author;
	}
	
	public void display() {
		System.out.println("Book isbn = " + getIsbn());
		System.out.println("Book name = " + getName());
		System.out.println("Book price = " + getPrice());
		System.out.println("Book publication = " + getPublication());
		System.out.println("Book author = "+getAuthor());
		
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", publication=" + publication
				+ ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + (int) (isbn ^ (isbn >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publication == null) ? 0 : publication.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publication == null) {
			if (other.publication != null)
				return false;
		} else if (!publication.equals(other.publication))
			return false;
		return true;
	}

	
}
/*
Assignement update the assignement to have user interaction
Write a class for Book having
book ISBN -long
book name - String 
book price - double
book publication - String
book author - String

a default constructor
parameterised constaructor having ISBN,name,price
parameterised constaructor having ISBN,name,publication,author

a toString method to display book information

BookNotFoundException


BookStore as interface 
  Book[] getBooks()//create an array of 5 objects to store information
  Book findBookById(Book []books , long ID); //return the book of matching ID
  Book findBookByName(Book []books , String name); //return the book of matching name

  Book updateBook(Book []books, long ID,double price);//update the bookprice of matching ID
  void displayBooks(Book[] books) //display book information


TestMain
   intialiase a book array using getbooks method by accepting values from user
   ask the user to enter a choice
   1. find by id
   2. findByName
   3. update price
   4. display all

*/