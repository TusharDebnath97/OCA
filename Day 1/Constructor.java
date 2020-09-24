package com.practice;
import java.io.*;
import com.practice.Con;
public class Constructor {
	
		
		String name; 
		int id; 

		Constructor(String name, int id) 
		{ 
			this.name = name; 
			this.id = id; 
		} 
	} 

	class GFG 
	{ 
		public static void main (String[] args) 
		{ 
			 
			Constructor con = new Con("adam", 1); 
			System.out.println("GeekName :" + con.name + 
							" and GeekId :" + con.id); 
		} 
	} 
