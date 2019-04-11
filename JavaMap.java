package datastructures;

/*
 * You are given a phone book that consists of people's names and their phone number. 
 * After that you will be given some person's name as query. For each query, print the phone number of that person.
 * 
 * Input Format
 * The first line will have an integer n denoting the number of entries in the phone book. 
 * Each entry consists of two lines: a name and the corresponding phone number. 
 * 
 * After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
 * 
 * Constraints:
 * A person's name consists of only lower-case English letters and it may be in the format 
 * 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
 * 
 *  1 <= n <= 100000
 *  1 <= Query <= 100000
 */

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
      Map phonebook = new HashMap();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
          phonebook.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
          if (phonebook.containsKey(s)) {
              System.out.println(s + "=" + phonebook.get(s));
          } else {
              System.out.println("Not found");
          }
		}
	}
}
