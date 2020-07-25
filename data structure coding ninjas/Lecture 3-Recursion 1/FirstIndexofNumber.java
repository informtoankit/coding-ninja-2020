/*
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1
*/
public class Solution {

	public static boolean checkNumber(int input[], int x) {
        //here we are checking each single index(input[i]) or we can say each shell of array to the number x
	 if(input[0]  ==  x)
        {
            return true;
        }
         if(input[0]  != x && input.length == 1)
        {
            return false;
        }
        //
            int smallinput[]=new int[input.length -1 ];
        for(int i = 1 ; i < input.length ; i ++){
            smallinput[i-1]=input[i];
        }
       boolean ans = checkNumber(smallinput,x);
        return ans ;
    }

 }

// 	public static void main(String[] args) {
// 	    int input[] = {1,2,4,6,9};
// 	    int x = 4 ;
// 		System.out.println(sum(input,x));
// 	}
// }
