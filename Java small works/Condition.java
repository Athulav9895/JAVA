package New.ja.va;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a>4*4) {
			System.out.println(" Grater than four's square");
		}
		else if (b>4*4) {
			System.out.println(" Grater than four's square");
		}
		else {
			System.out.println("It is smaller than four's square");
		}
	}

}
