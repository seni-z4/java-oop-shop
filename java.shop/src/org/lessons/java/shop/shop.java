package org.lessons.java.shop;

import java.util.Scanner;

public class shop {
	public static void main(String[] args) {

		prodotto products = new prodotto();
		

//		products.newProdotti() = 34 , 33;
		Scanner input = new Scanner(System.in);

		System.out.print("insert the name ; ");
		products.setNome(input.nextLine());

//		System.out.print(products.getNome()); 
		System.out.println(products.getCodice());
		
		System.out.print("insert the description of this product ; ");
		products.setdescrizione(input.nextLine());

		System.out.print("insert the product price ; ");
		products.setPrezzo(input.nextInt());
		

	}

}
