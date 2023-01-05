package com.methodindustries.problems;


public class ReverseString {
	
	public static void main(String[] args) 
	{
		String ret = reverse("hi");
		System.out.println(ret);
	}
	
		
	
	public static String reverse(String str) {
       String s = "" ;
	   for (int i=str.length() -1; i>=0; i--) 
	   {
		  s += str.charAt(i);
	   }
	   return s;
    }
	
}
