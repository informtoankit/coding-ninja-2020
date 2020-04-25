/*
Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
Palindrome strings are those, where string s and its reverse is exactly same.
Input Format :

 String S

Output Format :

"true" if S is palindrome, else "false"

Sample Input 1 :

abcdcba

Sample Output 1 :

true


*/
/*import java.util.Scanner; */
public class Solution {

	public static boolean checkPalindrome(String str){


        int i = 0 ;
        int j = str.length()-1;
     while(i<j)
     {
          // While there are characters to compare
         if(str.charAt(i) != str.charAt(j))

             return false;
          // Increment first pointer and
            // decrement the other
            i++;
            j--;

    }
  // Given string is a palindrome
    return true;
    }
}
/* public static void main(String[] args){

    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
   boolean value = checkPalindrome(str);
    System.out.println(value);
}
}
    */
