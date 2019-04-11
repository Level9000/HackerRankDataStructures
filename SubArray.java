package datastructures;

/*
 * We define the following:
 * 
 * A subarray of an n-element array is an array composed from a contiguous block of the 
 * original array's elements. For example, if array = [1,2,3], then the subarrays are [1], [2], [3], [1,2], [2,3], and [1,2,3].
 *  Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
 *  
 *  The sum of an array is the total sum of its elements.
 *  	An array's sum is negative if the total sum of its elements is negative.
 *  	An array's sum is positive if the total sum of its elements is positive.
 *  
 *  Given an array of n integers, find and print its number of negative subarrays on a new line.
 *  
 *  Input Format
 *  
 *  The first line contains a single integer, n, denoting the length of array A = [a0, a1, ... , an-1]. 
 *  The second line contains n space-separated integers describing each respective element, ai, in array A.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size]; 
        for(int i =0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        
        System.out.println(negativeSubArrayCount(arr));
    }
        
    private static int negativeSubArrayCount(int[] arr) {
        int counter = 0;
        //ending point
        for(int i=0; i < arr.length; i++) {
            int sum = 0;
            //sum of subarray
            for (int j = i; j < arr.length; j++) {
                sum += arr[j]; 
                //increment if negative
                if (sum < 0) {
                    counter ++;
                }
            }
        }
        return counter;
    }   
}