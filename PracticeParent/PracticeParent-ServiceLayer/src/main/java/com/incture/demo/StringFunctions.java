/**
 * Shruti.Bodhe
 * 2019-12-03
 */
package com.incture.demo;

/**
 * @author Shruti.Ghanshyam
 *
 */
public class StringFunctions {

	public static void main(String[] args) {
		String str = "123456789";
		System.out.println("Main String  : " + str);
		System.out.println("Length of String  : " + str.length());
		System.out.println("Character at 2 position of String  : " + str.charAt(2));
		System.out.println("Substring of String at 6th position   : " + str.substring(6));
		System.out.println("Substring of String at 6th position to 10th position  : " + str.substring(5, 8));
		System.out.println("contains '23' of String : " + str.contains("23"));
		System.out.println("contains '76' of String : " + str.contains("76"));
		System.out.println("Join Strings : " + String.join(" ", str, str));
		System.out.println("Starts with '12' Strings : " + str.startsWith("12"));
		System.out.println("Starts with 10 Strings : " + str.startsWith("10"));
		String str1 = "Java is a programming language. Java is a platform. Java is an Island.";
		System.out.println("Replace String  : " + str1.replace("Java", "Kava"));

		// compareTo()
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		// 0 because both are equal
		System.out.println("hello = hello : " + s1.compareTo(s2));
		// -5 because h is 5 times lower than m
		System.out.println("hello = meklo : " + s1.compareTo(s3));
		// -1 because l is 1 times lower than m
		System.out.println("hello = hemlo : " + s1.compareTo(s4));
		// 2 because h is 2 times greater than f
		System.out.println("hello = hemlo : " + s1.compareTo(s5));

		String e1 = new String("Hello");
		String e2 = new String("Hello");
		System.out.println("hello = hello : " + e1.equals(e2));
		System.out.println("hello = hello : " + e1.equals(s1));
		System.out.println("hello = hello : " + e1.equals(e1));
		System.out.println(e1 == e2);
		System.out.println(e1 == s1);
		System.out.println(e1 == e1);

		// Equals and = methods
		System.out.println("hello = hello : " + s1.equals(s2));
		System.out.println("hello = hello : " + s1.equals(s3));
		System.out.println("hello = hello : " + s1.equals(s1));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s1);
	}

}
