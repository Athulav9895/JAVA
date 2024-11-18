package Ath.u.l.Self;

import java.util.Scanner;

public class ThirdCube {
	static void Cube(int num) {
		System.out.println(num*num*num);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter a Number : ");
			int num=sc.nextInt();
	
	Cube(num);
	}

}
