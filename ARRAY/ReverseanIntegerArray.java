package a.rr.ay;
import java.util.Scanner;
public class ReverseanIntegerArray {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        
	        
	        int[] array = new int[size];
	        
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }
	    
	        int left = 0;
	        int right = size - 1;
	        while (left < right) {
	          
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            left++;
	            right--;
	        }
	   
	        System.out.println("Reversed array:");
	        for (int element : array) {
	            System.out.print(element + " ");
	        }
	        
	        sc.close();
	    }
	}
