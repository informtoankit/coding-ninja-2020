/*
Given a String S of length n, print all its substrings.
Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.
Input Format :

String S

Output Format :

 All Substrings of S, one in each line.

Note : The order in which you print substrings doesn't matter.
Sample Input 1 :

xyz

Sample Output 1 :

x
xy
xyz
y
yz
z
*/

public class Solution {

	public static void printSubstrings(String str){
	int k = 0 ;
        while(k < str.length())
        {
        for(int i = k ; i < str.length(); i++ )
        {

            System.out.println(str.substring(k,i+1));
            }
            k++;
        }
    }
}

    /*public static void main(String[] args) {
	String str = "xyz" ;
	substring(str);
	}
}
*/



	