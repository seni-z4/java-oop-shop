package org.lessons.java.shop;

import java.util.Scanner;

public class shop {
	public static void main(String[] args) {

		prodotto products = new prodotto();
		

//		products.newProdotti() = 34 , 33;
		Scanner input = new Scanner(System.in);

		System.out.println("insert the name");
		products.setNome(input.nextLine());

		System.out.println(products.getNome()); 
		System.out.println(products.getCodice());
		System.out.println(products.getCodice());


	}

}
