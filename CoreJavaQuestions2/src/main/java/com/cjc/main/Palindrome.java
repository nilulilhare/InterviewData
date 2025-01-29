package com.cjc.main;

public class Palindrome {
	public static void main(String[] args) {
		String str="Madama";
		String reverse="";
		
		for(int i=0; i<str.length();i++)
		{
			reverse=str.charAt(i)+reverse;
		}
		if(str.equalsIgnoreCase(reverse))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}

}
