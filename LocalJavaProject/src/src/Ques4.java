package src;

import java.util.Scanner;

public class Ques4 {
	public static void main(String args[]) {
		String name,revname = "";
		System.out.println("Input a string");
		
		Scanner sc = new Scanner(System.in);
		 name = sc.next();
		 for(int i=0;i<name.length();i++) {
			 revname = name.charAt(i)+ revname;
		 }
		 System.out.println(revname);
		 if(name.equals(revname)) {
				System.out.println("Palindrome string");
				
			}else {
				System.out.println("Not palindrome string");
				
			}
		 sc.close();
	}
}
