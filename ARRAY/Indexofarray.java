package a.rr.ay;
import java.util.Scanner;
public class Indexofarray {


	

	    public static void main(String[] args) {
	        
	        int[] array = {10, 20, 30, 40, 50};

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value to search for: ");
	        int searchValue = scanner.nextInt(); 

	        int index = -1;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == searchValue) { 
	                index = i; 
	                break; 
	            }
	        }

	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        scanner.close();
	    }
}
