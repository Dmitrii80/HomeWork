package com.my.home;
import java.util.Scanner;
public class HomeWork1v4 {
	public static void main (String[] args) {
		System.out.println("Enter your password and click <Enter>:");		
		String password = "nofate";
		Scanner scan = new Scanner(System.in);
		String passwordIn = scan.next();
		getEquals (password, passwordIn);
		scan.close();
	}
	private static void getEquals(String password, String passwordIn){	
		System.out.println(password.equals(passwordIn) ? "Pasword is correct" : "Pasword is wrong");
	}
}