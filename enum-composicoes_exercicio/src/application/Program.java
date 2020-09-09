package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdfB = new SimpleDateFormat("dd/MM/yyyy"); 

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		 System.out.print("Birth date: "); 
		 Date bDate = sdfB.parse(sc.next());
		 
		
		Client cliente = new Client(name, email,bDate );

		
		
		//System.out.println();
		System.out.println("Enter Order data: ");

		System.out.print("Status: ");
		OrderStatus orderS = OrderStatus.valueOf(sc.next());
		
		Order ordem = new Order(new Date(), orderS, cliente);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " " + "item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			Product produto = new Product(pName, pPrice);
			
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt();
			OrderItem items = new OrderItem(pQuantity,pPrice,produto);
			ordem.addItem(items);
		}

		System.out.println("Order Summary: ");
		System.out.println(ordem);
		
		
		sc.close();

	}

}
