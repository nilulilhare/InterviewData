package com.cjc.main;

public class ReveseString {
	public static void main(String[] args) {
		String str="Welcome";
		char[] array=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(array[i] );
		}
		
		StringBuffer sb=new StringBuffer(str);
		//System.out.println(sb.reverse().toString());
		
	}

}
