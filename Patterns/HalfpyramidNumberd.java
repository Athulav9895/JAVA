package Ath.u.l.Self;

import java.util.Scanner;

public class HalfpyramidNumberd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number:");

int n=sc.nextInt();
	for (int i=1; i<=n; i++) {
		
		for (int j=1; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}



	}

}
