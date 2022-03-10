package com;


public class InsertionSort {
	static void sort(String []s, int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	 
	        /**
	         *  Insert s[j] at its correct position for comparing i & j
	         */
	        int j = i - 1;
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	}
	 
	/**
	 *  Function to print the sorted array of string
	 * @param str
	 * @param n
	 */
	static void printArraystring(String str[], int n)
	{
	    for (int i=0; i<n; i++)
	        System.out.print(str[i]+" ");
	}
	 
	
	public static void main(String args[])
	{
	    String []arr = {"abc", "xyz5", "qwert", "ack"};
	    int n = arr.length;
	     
	    /**
	     *  Function to perform sorting of a String
	     */
	    sort(arr,n);
	    /**
	     *  Calling the function to print Sorted array
	     */
	    printArraystring(arr, n);
	     
	}
	}