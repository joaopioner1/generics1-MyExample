package application;

import java.util.Scanner;

import entities.ManipulateData;

public class Program {
	
	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 08/06/2021
		Scanner sc = new Scanner(System.in);
		
		ManipulateData<String> md1 = new ManipulateData<>();
		
		System.out.print("Enter quantity names: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Name #"+(i)+": ");
			String name = sc.next();
			md1.addValue(name);
		}
	
		System.out.println(md1.getFirst());
		
		System.out.println("---------------------");
		
		ManipulateData<Integer> md2 = new ManipulateData<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Number #"+(i)+": ");
			Integer number = sc.nextInt();
			md2.addValue(number);
		}
		
		System.out.println(md2.getFirst());
		sc.close();
	}
}
