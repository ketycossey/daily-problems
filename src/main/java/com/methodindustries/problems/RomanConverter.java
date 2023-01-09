package com.methodindustries.problems;

import java.util.*;

public class RomanConverter {
		public static void main(String[] args) {
			int num = romanToInt("CMXCIX");
			System.out.println(num);
			
			int num2 = romanToInt("MDCLXVI");
			System.out.println(num2);
			int num3 = romanToInt("CDXLIV");
			System.out.println(num3);
			
		}
		
		public static int romanToInt(String s) {
			Map<Character, Integer>map = new HashMap<Character, Integer>();
			map.put('I', 1);
			map.put('V', 5);
			map.put('X', 10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
			
			int result = 0;
			for (int i = 0; i<s.length(); i++) {
				if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i -1))) {
					result +=map.get(s.charAt(i)) -  2*map.get(s.charAt(i-1));
				}
				else
					result +=map.get(s.charAt(i)); 
				
			}
				return result;		
			
			
		}
}
