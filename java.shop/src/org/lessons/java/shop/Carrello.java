package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javaInheritanceShop Shop = new javaInheritanceShop();
		prodotto products = new prodotto();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insert the product");
		
		Shop.setSmarphone(input.nextLine());
		
		System.out.println("insert the product tv");
		Shop.setTelevisore(input.nextLine());
		
		System.out.println("insert the product cuffie");
		Shop.setCuffie(input.nextLine());

		System.out.print(Shop.toString());
	}

}
