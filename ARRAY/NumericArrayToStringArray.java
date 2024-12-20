package a.rr.ay;

public class NumericArrayToStringArray {

		    public static void NumericArray(int[] arr) {
		        int n = arr.length;

		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                   
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		        System.out.print("Sorted numeric array: ");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println(); 
		    }

		    public static void StringArray(String[] arr) {
		        int n = arr.length;

		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		               
		                if (arr[j].compareTo(arr[j + 1]) > 0) {
		                  
		                    String temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		       
		        System.out.print("Sorted string array: ");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println(); 
		    }

		    public static void main(String[] args) {
		       
		        int[] numArray = {32, 14, 5, 78, 67, 25};
		        System.out.println("Original numeric array: ");
		        for (int i = 0; i < numArray.length; i++) {
		            System.out.print(numArray[i] + " ");
		        }
		        System.out.println();

		        NumericArray(numArray);

		        String[] strArray = {"Apple", "Orange", "Banana", "Mango"};
		        System.out.println("Original string array: ");
		        for (int i = 0; i < strArray.length; i++) {
		            System.out.print(strArray[i] + " ");
		        }
		        System.out.println(); 

		        StringArray(strArray);
		    }
		}


