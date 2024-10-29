package nnew.ja.va;

import java.util.Scanner;

public class CheckitisaAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string to check it is a anagram / not :");
		String src=sc.nextLine();
src = src.toLowerCase().replaceAll("\\s", "");
		
		System.out.print("Enter string 2: ");
		String b = sc.nextLine();
		b = b.toLowerCase().replaceAll("\\s", "");
		
		String arr1[] = new String[src.length()];
		
		for(int i=0;i<src.length();i++)
		{
			arr1[i] = String.valueOf(src.charAt(i));
		}
		
		System.out.print("Array-1 elements are:");
		
        for (String x:arr1) 
        {
            System.out.print(x+" ");            
        }
        int length1 = arr1.length;
        
        String arr2[] = new String[b.length()];
        
        for(int i=0;i<b.length();i++)
        {
        	arr2[i] = String.valueOf(b.charAt(i));
        }
        
        System.out.print("\nArray-2 elements are:");
        
        for(String y:arr2)
        {
        	System.out.print(y+" ");
        }
        int length2 = arr2.length;
        
        if(length1!=length2)
        {
        	System.out.println("\nNot an anagram");
        }
        else
        {
        	for(int i=0;i<arr1.length-1;i++)
        	{
        		int minIndex = i;
        		
        		for(int j=i+1;j<arr1.length;j++)
        		{
        			if(arr1[j].compareTo(arr1[minIndex])<0)
        			{
        				minIndex = j;
        			}
        		}
        		String temp = arr1[i];
        		arr1[i] = arr1[minIndex];
        		arr1[minIndex] = temp;
        	}
        	System.out.print("\nAfter sorting array-1: ");
        	for(String x:arr1)
        	{
        		System.out.print(x+" ");
        	}
        	
        	
        	
        	for(int i=0;i<arr2.length-1;i++)
        	{
        		int minIndex = i;
        		
        		for(int j=i+1;j<arr2.length;j++)
        		{
        			if(arr2[j].compareTo(arr2[minIndex])<0)
        			{
        				minIndex = j;
        			}
        		}
        		String temp = arr2[i];
        		arr2[i] = arr2[minIndex];
        		arr2[minIndex] = temp;
        	}
        	
        	 System.out.print("\nAfter sorting array-2: ");
         	for(String y:arr2)
         	{
         		System.out.print(y+" ");
         	}
         	
         	int count = 0;
         	for(int i=0;i<arr1.length;i++)
         	{
         		if(arr1[i].equals(arr2[i]))
         		{
         			count++;
         		}
         	}
         	
         	if(count==arr1.length)
         	{
         		System.out.println("\nAnagram");
         	}
         	else
         	{
         		System.out.println("\nNot an anagram");
         	}
        }
		
		
	}

}
