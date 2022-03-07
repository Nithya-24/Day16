package com;

public class Permutation {
	
	 /**  Function to print all the permutations of string
	  * 
	  * @param str
	  * @param ans
	  */
    static void permutn(String str, String ans)
    {
 
        /**
         *  if my string is empty
         */
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            /** Read the ith character of string and store a string to ch
             * 
             */
            char ch = str.charAt(i);
 
            String rec = str.substring(0, i) + str.substring(i + 1);
 
            /**
             *  Here calling Recursive function
             */
            permutn(rec, ans + ch);
        }
    }
 
    
    public static void main(String[] args)
    {
        String s = "abc";
        permutn(s, "");
    }
}


