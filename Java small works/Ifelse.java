package New.ja.va;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter a number");
int a=sc.nextInt();
if(a%4==0) {
	System.out.println("It is divisible by four");
}
else {
	System.out.println("not divisible");
}
	}

}
