package nnew.ja.va;

import java.util.Scanner;

public class tocheckwhetherastringisPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name to check if it is a palindrome or not : ");
			String str = sc.nextLine();
			String s = "";
			for(int i=str.length()-1;i>=0;i--)
			{
				s+=str.charAt(i);
			}
			
			if(str.equals(s))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a palidrome");
			}
		}

	}