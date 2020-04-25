/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :

String S

Output Format :

Minimum length word

Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :

this is test string

Sample Output 1 :

is

Sample Input 2 :

abc de ghihjk a uvw h j

Sample Output 2 :

a


*/
public class Solution {

	public static String minLengthWord(String str){
		      String[] arr=str.split(" ");
        int i=0;
        int maxlength=Integer.MAX_VALUE;
        String largest = "";
        String smallest = "";
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].length() < maxlength){
                smallest=arr[i];
                maxlength=arr[i].length();
            }
        }
            return smallest;}
    }

// write the main fucntion
