package nnew.ja.va;

import java.util.Scanner;

public class Insertastringintoanotherstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
String a=sc.next();
String sec= "";
for (int i=0;i<a.length();i++) {
	sec+=a.charAt(i);
}
System.out.println(sec);
	}

}
