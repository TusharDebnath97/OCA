package com.practice;

class Test { 
	public static void main(String[] args) 
	{ 
		String s = new String("hello"); 
		String s2 = "hello"; 

		if (s == s2) { 
			System.out.println("=="); 
		} 

		if (s.equals(s2)) { 
			System.out.println("equals"); 
		} 
	} 
} 
