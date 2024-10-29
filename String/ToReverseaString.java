package nnew.ja.va;

import java.util.Scanner;

public class ToReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string to reverse");
Scanner sc= new Scanner (System.in);
String src=sc.nextLine();
String s="";

	for (int i=src.length()-1;i>=0;i--){
		s+=src.charAt(i);
		
	}
	System.out.println("Reverse of "+ src + " is " + s);
	
			

	}

}
