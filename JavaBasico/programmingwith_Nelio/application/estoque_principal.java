package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class estoque_principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = tec.nextLine();
		System.out.print("Price: ");
		product.price = tec.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = tec.nextInt();
		
		System.out.println();
		System.out.println("Product data: "+product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = tec.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: "+product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove from stock: ");
		quantity = tec.nextInt();
		product.removeProduct(quantity);
		System.out.println("Updated data: "+product);	
		
		tec.close();

	}

}
