package com.pranav;
import java.util.Scanner;

public class Plindrome {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = sc.nextLine();
		int length = original.length();

		for (int i = (length-1); i >= 0; i--)
			reverse = reverse + original.charAt(i);
			System.out.println(reverse);

		if (original.equals(reverse)) {
			System.out.println("Entered string is a Palindrome.");
		}
		else {
			System.out.println("Entered string is Not a Palindrome.");
		}
		sc.close();
	}
}