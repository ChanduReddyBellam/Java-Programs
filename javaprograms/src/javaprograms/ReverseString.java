package javaprograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a reverse string");
		Scanner read =new Scanner(System.in);
		String str=read.nextLine();
		String reverse="";
		for(int i =str.length()-1;i>=0;i--) {
			reverse =reverse + str.charAt(i);
			
		}
		System.out.println("Reverse stringis:");
		System.out.println(reverse);
	}

}
