package com.yml.dataStructures;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner r= new Scanner(System.in);
		OrderedList o = new OrderedList();
		File file = new File("/Users/panchamishenoy/Desktop/assignment/DataStructures/src/com/yml/dataStructures/data.txt");
		Scanner sc = new Scanner(file);

		String str;
		String s = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			s = s + str;
		}
		sc.close();
		String[] arr = s.split(" ");
		int[] array = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}
		o.bubbleSort(array);
		int choice=1;
		while(choice==1) {
			System.out.println("Enter the choice 1.enter input 2.quit");
		 choice=r.nextInt();
		 if(choice==1) {
		System.out.println("Enter the element");
		Integer input=r.nextInt();
		o.search(input);
		 o.display();
		 o.write();
		}
		 }
	}
}