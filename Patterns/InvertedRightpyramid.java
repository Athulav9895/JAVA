package Ath.u.l;

import java.util.Scanner;

public class InvertedRightpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for the pyramid");
		int n=sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
