/*
Write a class for Book having
book ISBN -long
book name - String 
book price - double
book publication - String
book author - String

a default constructor
parameterised constaructor having ISBN,name,price
parameterised constaructor having ISBN,name,publication,author

a display method to display book information


BookStore
  Book[] getBooks()//create an array of 5 objects to store information
  Book findBookById(long ID); //return the book of matching ID
  Book updateBook(long ID,double price);//update the bookprice of matching ID


*/

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
