package Ath.u.l;

import java.util.Scanner;

public class InvertedHalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for the Rows and Columns:");
int n=sc.nextInt();

for(int i=n; i>=1; i--) {
	for (int j=1; j<=i; j++) {
		System.out.print("*");
	}
	System.out.println();
}

	}

}
