/*
Given a string S, count number of words in the string.
Note : Assume there is single space between two words and there are no extra spaces before and after words.
Input Format :

 String S

Output Format :

Count of words

Sample Input :

this is a sample string

Sample Output :

5


*/

public class Solution {

	public static void countWords(String str){

        int count=0;

  for(int i=0;i<str.length();i++)
  {
      if(str.charAt(i)==' '){
          count++;}
  }
	count++;
    return count;
    }
}


// write main body 
