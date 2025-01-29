package com.cjc.main;

public class CountCharacterAndDigits {
	public static void main(String[] args) {
		String str="magc14to58wel";
		
		int c=0;
		int d=0;
		for(char ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				d++;
			}
			else if(Character.isLetter(ch))
			{
				c++;
			}
		
		}
		System.out.println("Number of Character "+c);
		System.out.println("Number of Digit "+d);
		
	}


}
