import java.util.Scanner;

import com.book.Book;
import com.bookstore.BookStoreImpl;
import com.exception.BookNotFoundException;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookStoreImpl bs = new BookStoreImpl();
		Book[] books = bs.getBooks();
		
		
		Scanner sc = new Scanner(System.in);
		long isbn;
		String name;
		double price;
		int choice;
		Book b;
		while(true) {
			System.out.println("1. Find book by ISBN\n2. Find book by name\n3. Update book price\n4. Display book details\n5. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Enter ISBN number to find the details of the book");
			         isbn = sc.nextLong();
			         b = bs.findBookById(books, isbn);
			         if(b.getIsbn() != 0)
			        	 System.out.println("The details of the book are : \n"+b);
			         else {
			        	 try{
								throw new BookNotFoundException("Sorry! There is no book with given ISBN.Please enter a valid ISBN."); //here the message will be thrown

						} catch (BookNotFoundException e) {
							// TODO Auto-generated catch block
						    e.printStackTrace();
						    }
			         }
			        	 //System.out.println("Sorry! There is no book with given ISBN.Please enter a valid ISBN.");
			         System.out.println("-----------------------------------");
			         break;
			case 2 : System.out.println("Enter name of the book to find");
			         name = sc.next();
			         b = bs.findBookByName(books, name);
			         if(b.getName() != null)
					     System.out.println("The details of the book are : \n"+b);
					 else
					 {
						 try{
								throw new BookNotFoundException("Sorry! There is no book with given name.Please enter a valid name.");

						} catch (BookNotFoundException e) {
							// TODO Auto-generated catch block
						    e.printStackTrace();
						    }
					 }
					     //System.out.println("Sorry! There is no book with given name.Please enter a valid name.");
			         System.out.println("-----------------------------------");
			         break;
			case 3 : System.out.println("Enter ISBN for the book to update the price");
			         isbn = sc.nextLong();
			         System.out.println("Enter the updated price for the ISBN "+isbn);
			         price = sc.nextDouble();
			         b = bs.updateBook(books, isbn, price);
			         if(b.getIsbn()!=0)
			        	 System.out.println("The details of the book are : \n"+b);
			         else {
			        	 try{
								throw new BookNotFoundException("Sorry! There is no book with given ISBN.Please enter a valid ISBN for updating the price.");

						} catch (BookNotFoundException e) {
							// TODO Auto-generated catch block
						    e.printStackTrace();
						    }
			         }
			        	// System.out.println("Sorry! There is no book with given ISBN.Please enter a valid ISBN for updating the price.");
			         System.out.println("-----------------------------------");
			         break;
			case 4: System.out.println("The details of all the books are as follows :- ");
			        bs.display(books);
			        System.out.println("-----------------------------------");
			        break;
			case 5: System.exit(0);
			}
		}
		
  
	}

}
