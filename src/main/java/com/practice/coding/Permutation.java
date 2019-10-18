package com.practice.coding;

import java.util.HashSet;
import java.util.Set;

// Java program to print all permutations of a
// given string.
public class Permutation
{
	static Set<String> result = new HashSet<>();
    public static void main(String[] args)
    {
        String str = "ABC";
        
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
        result.stream().forEach(s->System.out.println(s));
    }
 
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int l, int r)
    {
        if (l == r)
        	result.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
            }
        }
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
//        System.out.println("Swaping: "+charArray[i]+" <> "+charArray[j]);
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}
