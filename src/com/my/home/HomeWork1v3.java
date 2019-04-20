package com.my.home;
import java.util.Random;
import java.util.Scanner;
public class HomeWork1v3 {
	public static void main(String[ ] args) {
		System.out.println("Введите количество случайных чисел: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		
		Random rand = new Random();
		System.out.println("Вывод результата случайных чисел без перехода на новую строку: ");
			for(int i = 0; i < n; i++)
				System.out.print(rand.nextInt(128)+1 + " ");
		
		System.out.print("\n");	
		
		System.out.println("Вывод результата случайных чисел с переходом на новую строку: ");
			for(int i = 0; i < n; i++)
				System.out.println(rand.nextInt(128)+1 + " ");
		scan.close();
		}
}