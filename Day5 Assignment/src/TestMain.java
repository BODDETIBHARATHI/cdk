import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.ProductDAOImpl;
import com.io.ProductIOImpl;
import com.pojo.Product;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Product> l = new ArrayList<Product>();
		Product product = new Product();
		ProductDAOImpl pdao = new ProductDAOImpl();
		ProductIOImpl pio = new ProductIOImpl();
		while (true) {
			System.out.println(
					"1. Enter 1 for adding the product.\n2. Enter 2 for updating the product.\n3. Enter 3 for updating product by quality.\n4. Enter 4 for displaying all product.\n5. Enter 5 for finding product by category.\n6. Enter 6 for find the product by ID.\n7. Enter 7 for deleting product by id.\n8. Enter 8 for exit.");
			switch (sc.nextInt()) {
			case 1:
				product = pio.getProduct();
				pdao.addProduct(product);
				pio.displayProduct(product);
				System.out.println("************************************************************");
				break;
			case 2:
				System.out.println("Enter product id for the product to update");
				int productId = sc.nextInt();
				System.out.println("Enter price of the product to update");
				double price = sc.nextDouble();
				boolean flag = pdao.updateProduct(productId, price);
				if (flag == false)
					System.out.println(
							"Sorry! Unable to find product with given ID. Please check the ID which you have entered.");
				System.out.println("**************************************************************");
				break;
			case 3:
				System.out.println("Enter product id for the product to update");
				int productId1 = sc.nextInt();
				System.out.println("Enter quantity for the product with id : " + productId1);
				int quantity = sc.nextInt();
				boolean flag1 = pdao.updateProduct(productId1, quantity);
				if (flag1 == false)
					System.out.println(
							"Sorry! Unable to find product with given ID. Please check the ID which you have entered.");
				System.out.println("*****************************************************************");
				break;
			case 4:
				System.out.println("The list of all products :--");
				l = pdao.findAll();
				for (Product p : l)
					pio.displayProduct(p);
				System.out.println("*****************************************************************");
				break;
			case 5:
				System.out.println("Enter product category to find all the products under the category.");
				String category = sc.next();
				l = pdao.findAllByCategory(category);
				if (l.size() > 0)
					for (Product p : l) {
						pio.displayProduct(p);
					}
				System.out.println("****************************************************************");
				break;
			case 6:
				System.out.println("Enter product id in order to find the details of the product.");
				productId = sc.nextInt();
				product = pdao.findById(productId);
				if (product.getpId() != 0)
					pio.displayProduct(product);
				System.out.println("***************************************************************");
				break;
			case 7:
				System.out.println("Enter the id of the product which you want to delete");
				productId = sc.nextInt();
				pdao.deleteById(productId);
				System.out.println("**************************************************************");
				break;
			case 8:
				System.out.println("**************Exiting*************");
				System.exit(0);
			default:
				System.out.println("Please enter a valid option");
				break;

			}
		}

	}

}
/*
 * int addProduct(Produc product); boolean updateProduct(int productId, double
 * price); boolean updateProduct(int productId, int quantity); Product
 * findById(int productId); List<Product> findAll(); List<Product>
 * findAllByCategory(String category); ---------------- Main 1. add 2. update.
 * 3.find all 3find by Category , find by Id, update by quantity
 */