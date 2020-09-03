
public class FinalBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookStore bs = new BookStore();
		Book books[] = bs.getBooks();
		System.out.println("The list of all books are ");
		for (Book b : books) {
			b.display();
			System.out.println("--------------------------------");
		}
		long findId = 123456;
		Book findBook = bs.findBookById(findId);
		if (findBook.getIsbn() == 0)
			System.out.println("Sorry we can't find the book with the given ID");
		else
		{
			System.out.println("The details of the book with given id " + findId + " are ");
			findBook.display();
		}
		System.out.println("---------------------------------------");
		double updateprice = 1000;
		long idForUpdate = 345698;
		Book updatedBookPrice = bs.updateBook(idForUpdate, updateprice);
		if (updatedBookPrice.getIsbn() == 0)
			System.out.println("Sorry the book which you are trying to update is unavailable");
		else
		{
			System.out.println("After updating the price for the id "+idForUpdate+"details of the book are ");
			updatedBookPrice.display();
		}
	}

}
