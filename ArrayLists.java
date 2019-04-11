package datastructures;

/*
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. 
 * Try to solve this problem using Arraylist.
 * 
 * You are given n lines. In each line there are zero or more integers. You need to answer a few queries 
 * where you need to tell the number located in yth position of xth line. 
 * Take your input from System.in.
 * 
 * Input Format
 * The first line has an integer n. In each of the next n lines there will be an integer d denoting 
 * number of integers on that line and then there will be d space-separated integers. 
 * In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        //read next int.  This will be number of lines we apply list array to
        int n = sc.nextInt();
        List<List<Integer>> intArrList = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> lineArrayList = new ArrayList<Integer>();
            //populate the lineArray for the number of integers specified by d
            for(int j = 0; j < d; j++) {
                lineArrayList.add(sc.nextInt());
            }
            //add the new array to the array list
            intArrList.add(lineArrayList);
        }
        //read next int.  This will be the number of queries that we execute
        int q = sc.nextInt();
        // assign next two numbers to values x and y
        for(int k = 0; k < q; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // if y is greater than # of lines, throw error message, else return value of 
            // number at that position
            if(y > intArrList.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(intArrList.get(x-1).get(y-1));
            }
        }
    }
}