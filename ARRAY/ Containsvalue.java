package a.rr.ay;

	public class Containsvalue {
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50}; 
	        int searchValue = 30;              
	        boolean found = false;               

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == searchValue) {  
	                found = true;                
	                break;                       
	            }
	        }

	        if (found) {
	            System.out.println("Array contains the value " + searchValue);
	        } else {
	            System.out.println("Array does not contain the value " + searchValue);
	        }
	    }
	}