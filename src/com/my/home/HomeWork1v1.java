package com.my.home;
import java.util.Scanner;
public class HomeWork1v1 {
	public static void main(String[ ] args) {
		System.out.println("Enter your name and click <Enter>:");
		Scanner scan = new Scanner(System.in);
		//String name = scan.next();
		//System.out.println("Hi, " + name);
		System.out.println("Hi, " + scan.nextLine());
		scan.close();
	}
}