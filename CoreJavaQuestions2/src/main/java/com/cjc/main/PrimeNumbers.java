package com.cjc.main;

public class PrimeNumbers {
	public boolean IsPrime(int n)
	{
		if(n==0 || n==1)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		for(int i=2; i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		PrimeNumbers p=new PrimeNumbers();
		boolean prime=p.IsPrime(4);
		System.out.println(prime);
	}
	
	
}
