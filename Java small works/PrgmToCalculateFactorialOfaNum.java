package Ath.u.l.Self;

import java.util.Scanner;

public class PrgmToCalculateFactorialOfaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		
		long factorial=1;
		int i=num;
		
		while(i>0) {
			factorial = factorial*i;
			i--;
			
		}
		System.out.println(" Factorial of" + num + "is" + factorial);

	}

}
