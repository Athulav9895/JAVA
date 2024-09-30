package Ath.u.l.Self;

import java.util.Scanner;

public class MultipilicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int num=sc.nextInt();
System.out.println("Multiplication of " + num + "=");
for(int i=1; i<=100; i++) {
	
	int result=num*i;
	System.out.println(num + "x" + i + "=" + result);
	
}
System.out.println();
	}

}
