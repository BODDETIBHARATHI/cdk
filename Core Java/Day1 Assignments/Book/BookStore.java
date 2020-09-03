/*
BookStore
Book[] getBooks()//create an array of 5 objects to store information
Book findBookById(long ID); //return the book of matching ID
Book updateBook(long ID,double price);//update the bookprice of matching ID
*/

public class BookStore {
//	book ISBN -long
//	book name - String 
//	book price - double
//	book publication - String
//	book author - String
//	
	Book[] getBooks() {
		Book[] books = new Book[5];
        books[0] = new Book(123456, "Java Programming", 800, "ABC", "Surya" ) ;
        books[1] = new Book(345698, "Python Programming", 500, "DEF", "Ganesh");
        books[2] = new Book(456789, "C Programming", 300, "XYZ", "Manasa");
        books[3] = new Book(147258, "Data Structures and Algorithms", 900, "ABC", "Durga");
        books[4] = new Book(369025, "Design Patterns", 700, "XYZ", "Venkat");
	
        
        return books;
    }
	
	Book findBookById(long ID) {
		for(Book b : getBooks()) {
			if(b.getIsbn() == ID)
				return b;
		}
		return new Book();
	}
	
	Book updateBook(long ID,double price) {
		for(Book b : getBooks()) {
			if(b.getIsbn() == ID)
			{
				b.setPrice(price);
				return b;
			}
		}
		return new Book();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
