package a.rr.ay;

public class Sumarray {

	    public static void main(String[] args) {
	 
	        int[] a= {10, 20, 30, 40, 50};

	        if (a== null || a.length == 0) {
	            System.out.println("The array is empty or null. Sum is 0.");
	        } else {
	         
	            int sum = 0;

	   
	            for (int i = 0; i < a.length; i++) {
	                sum += a[i]; 
	            }

	            System.out.println("Sum of array elements: " + sum);
	        }
	    }
	}
