package Ath.u.l.Self;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();
        
        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();
        
        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int greatest;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(number 1 is greatest);
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        

        in.close(); 
    }
}
