package a.rr.ay;

import java.util.Arrays; 

public class RemoveElement {

	
	    public static void main(String[] args) {
	     
	        int[] array = {10, 20, 30, 40, 50};
	        int removeIndex = 2; 

	        int[] newArray = new int[array.length - 1];

	        for (int i = 0, j = 0; i < array.length; i++) {
	            
	            if (i != removeIndex) {
	                newArray[j++] = array[i]; 
	            }
	        }

	        System.out.println("Array after removing element: " + Arrays.toString(newArray));
	    }
	}
