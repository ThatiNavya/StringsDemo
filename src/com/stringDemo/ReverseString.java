package com.stringDemo;

import java.io.*;
public class ReverseString {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		   BufferedReader br  = new BufferedReader(isr);
		   System.out.println("Enter a String");
		   String originalString = br.readLine();
		   int length  = originalString.length();
		   String reverse ="";
		   for(int i=length-1;i>=0;i--) {
			   reverse=reverse+originalString.charAt(i);
		   }System.out.println(reverse);

	}

}
