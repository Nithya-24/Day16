package com;

public class BinarySearchString {
	
	 static int binarySearch(String[] arr, String x)
	    {
		 /**
		  * Initializing Variables to find searching for a string
		  */
	        int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	 
	            int res = x.compareTo(arr[m]);
	 
	            /**
	             *  Check if x is present at mid
	             */
	            if (res == 0)
	                return m;
	 
	            /**
	             *  If x greater, ignore left half
	             */
	            if (res > 0)
	                l = m + 1;
	 
	            /**
	             *  If x is smaller, ignore right half
	             */
	            else
	                r = m - 1;
	        }
	 
	        return -1;
	    }
	 
	 
	    public static void main(String []args)
	    {
	        String[] arr = { "abc", "nith", "yav", "ida"};
	        String x = "ide";
	        int result = binarySearch(arr, x);
	 
	        if (result == -1)
	            System.out.println("Element is not present");
	        else
	            System.out.println("Element is present at "
	                              + "index " + result);
	    }
	}