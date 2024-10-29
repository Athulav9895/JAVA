package nnew.ja.va;

import java.util.Scanner;

public class Thirdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner sc=new Scanner (System.in);
		String wr=sc.next();
		
		String[] words=wr.split(" ");
		for (String word : words) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}
		
	}

}
