package Ath.u.l;

import java.util.Scanner;

public class Halfpyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number for the Rows and Columns:");
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
