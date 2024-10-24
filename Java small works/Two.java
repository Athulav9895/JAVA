package Ath.u.l.Self;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a:");
		double a=sc.nextInt();
		System.out.println("Enter the value for b:");
		double b=sc.nextInt();
		System.out.println("Enter the value for c:");
		double c=sc.nextInt();
		
		double result= b * b - 4.0 * a * c;
		
		if(result>0.0) {
			double p1 = (-b+ Math.sqrt(result)) / (2.0*a);
			double p2 = (-b- Math.sqrt(result)) / (2.0*a);
			System.out.println("The roots are " + p1 + " and " + p2 );
			
		}
		else if(result==0.0) {
			double p3 =  -b / (2.0 * b);
			System.out.println("The roots are" + p3);
		}
		
		else {
			System.out.println("The equation has no real roots.");
		}
		
		
	}

}
