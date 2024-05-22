package org.lessons.java.shop;

import java.util.Scanner;

public class shop {
	public static void main(String[] args) {

		prodotto products = new prodotto();

//
////		products.newProdotti() = 34 , 33;
//		Scanner input = new Scanner(System.in);
//
//		System.out.print("insert the name ; ");
//		products.setNome(input.nextLine());
//
////		System.out.print(products.getNome()); 
//		System.out.println(products.getCodice());
//		
//		System.out.print("insert the description of this product ; ");
//		products.setdescrizione(input.nextLine());
//
//		System.out.print("insert the product price ; ");
//		products.setPrezzo(input.nextInt());
//		

		Scanner input = new Scanner(System.in);

		// codice prodotto
		System.out.println("codice: " + products.getCodice());

		System.out.println("insert the product name: ");
		products.setNome(input.nextLine());

		// output del nome
		System.out.println("the name of this product is :" + products.getNome());

		// scanner di description
		System.out.println("insert the description : ");
		products.setDescription(input.nextLine());

		// output del description
		System.out.println("the description of this product is : " + products.getDescription());

		// scanner del prezzo
		System.out.println("what is the price of this product.");

		products.setPrezzo(input.nextInt());

		// output del prezzo
		System.out.println("the product price is : " + products.getPrezzo());

		// get&set iva;
		System.out.println("iva di 22% e di : " + products.getIva());

		// final
		System.out.println("il prezzo finale e di " + (products.getPrezzo() - products.getIva()));

	}

}
