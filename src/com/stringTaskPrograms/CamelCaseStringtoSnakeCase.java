package com.stringTaskPrograms;

public class CamelCaseStringtoSnakeCase {

	public static String camelToSnake(String str) {

		String result = "";

		char c = str.charAt(0);
		result = result + Character.toLowerCase(c);
		for (int i = 1; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				result = result + '_';   
				result = result + Character.toLowerCase(ch);
			}

			else {
				result = result + ch; //navya_thati
			}
		}

		return result;
	}

	public static void main(String args[]) {

		String str = "NavyaThati";  //navya_thati
		//String str1 ="shiva_thati";

		System.out.print(camelToSnake(str));
	}
}
