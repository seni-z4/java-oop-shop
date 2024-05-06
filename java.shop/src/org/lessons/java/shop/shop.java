package org.lessons.java.shop;

import java.util.Scanner;

public class shop {
	public static void main(String[] args) {

		prodotto products = new prodotto();
		

//		products.newProdotti() = 34 , 33;
		Scanner input = new Scanner(System.in);
		products = input.nextLine();

		System.out.println(products.numeroRandom());

	}

}
