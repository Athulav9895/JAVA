package a.rr.ay;
import java.util.Arrays; 
public class CopyanarrayandIterating {
	    public static void main(String[] args) {
	     
	        int[] array = {10, 20, 30, 40, 50}; 

	        int[] copiedArray = new int[array.length]; 

	        for (int i = 0; i < array.length; i++) {
	            copiedArray[i] = array[i]; 
	        }

	        
	        System.out.println("Copied array: " + Arrays.toString(copiedArray)); 
	    }
	}
