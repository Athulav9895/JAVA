package Ath.u.l.Self;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter to check:");
String a=sc.nextLine();
String b= "";
	for (int i=a.length()-1;i>=0;i--) {
		b=b+(a.substring(i,i+1));
		
	}
	System.out.println(a);
	System.out.println(b);
if (a.equals(b)) {
	System.out.println("it is a palindrom");
}
else {
	System.out.println("it is not a palindrom");
}
	}

}
