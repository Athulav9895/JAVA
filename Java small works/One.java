package Ath.u.l.Self;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if (num>0) {
			System.out.println("Number is Positive");
		}
		else if (num<0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("It is zero");
		}
		
	}

}
