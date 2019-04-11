package datastructures;

/*
 * For this problem, we have 2 types of queries you can perform on a List:
 * 1. Insert y at index x:
 * 		Insert
 * 		x y
 * 2. Delete the element at index x:
 * 		Delete
 * 		x
 * Given a list, L, of N integers, perform Q queries on the list. 
 * Once all queries are completed, print the modified list as a single line of space-separated integers.
 * 
 * Input Format
 * 
 * The first line contains an integer, N (the initial number of elements in L). 
 * The second line contains N space-separated integers describing L. 
 * The third line contains an integer, Q (the number of queries). 
 * The 2Q subsequent lines describe the queries, and each query is described over two lines:
 * 
 * 		If the first line of a query contains the String Insert, then the second line contains two space 
 * 		separated integers x y, and the value y must be inserted into L at index x.
 * 
 * 		If the first line of a query contains the String Delete, then the second line 
 * 		contains index x, whose element must be deleted from L.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            myList.add(in.nextInt());
        }
        int Q = in.nextInt();
        String rule;
        //##
        for(int j = 0; j < 2; j++) {
            rule = in.next();
            if(rule.contains("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                myList.add(x,y);
                
            }else if(rule.contains("Delete")) {
                int x = in.nextInt();
                myList.remove(x);
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}