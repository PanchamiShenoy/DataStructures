package com.yml.dataStructures;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		UnorderedList ul = new UnorderedList();
		ul.readFile();
		ul.display();
		int choice = 1;

		while (choice == 1) {
			System.out.println("enter 1.to enter input   2.to quit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			if (choice == 1) {
				ul.getUserInput();
				ul.display();
				ul.writeFile();
			}
		}
	}
}
