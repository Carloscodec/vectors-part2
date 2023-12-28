package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of products to be inserted: ");
		int n = input.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			input.nextLine();
			System.out.println("Product #" + (i + 1));
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Price: $");
			double price = input.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("Average price: $ %.2f%n", avg);
		
		input.close();

	}

}
