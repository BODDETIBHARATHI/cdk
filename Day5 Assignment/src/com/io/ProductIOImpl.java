package com.io;

import java.util.List;
import java.util.Scanner;

import com.daoiointerface.ProductIO;
import com.pojo.Product;

public class ProductIOImpl implements ProductIO{

	@Override
	public Product getProduct() {
		Scanner sc=new Scanner(System.in);
		int pId,quantity;
		String pName,category;
		double price;
		System.out.println("Enter product id:");
		pId=sc.nextInt();
		System.out.println("Enter product name:");
		pName=sc.next();
		System.out.println("Enter product price:");
		price=sc.nextDouble();
		System.out.println("Enter product quantity:");
		quantity=sc.nextInt();
		System.out.println("Enter product category:");
		category=sc.next();
		Product p=new Product(pId,pName,price,quantity,category);
		return p;
	}

	@Override
	public void displayProduct(Product product) {
		System.out.println(" Product Id : "+product.getpId()+
				           "\tProduct Name : "+product.getpName()+
		                   "\tProduct Price : "+product.getPrice()+
		                   "\tProduct Quantity : "+product.getQuantity()+
		                   "\tProduct Category : "+product.getCategory());
	}
	
	
}
/*
com.io

ProductIO
 product getProduct(); ///accept value form user
 void displayProduct(Product product); //display values to user

*/