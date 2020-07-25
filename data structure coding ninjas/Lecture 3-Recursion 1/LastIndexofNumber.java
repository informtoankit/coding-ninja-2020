/*
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
3
*/
public class Solution {

	private  static int  checkNumber(int input[], int x ,int  startindex) {

	    //in below condition we are checking number x in array from end to start
	   if(input[startindex] ==  x )
	    {
	        return startindex ;
	    }
        // this below condition says that number is not persent and array is traversed
	    if(x    !=  input[startindex] &&  startindex == 0 ){
	        return -1 ;
	    }
	    int ans = checkNumber(input, x  , startindex - 1);
	    return ans ;
    }
		public static int lastIndex(int input[], int x) {
            //here we are taking array length in startindex and move from end to start
		   int startindex = input.length -1 ;
		    return checkNumber( input , x , startindex);
        }
}
    /*
		public static void main(String[] args) {
	    int input[] = {9 ,8 ,10, 8};
	    int x = 8 ;
		System.out.println(checkNumber(input,x));
	}
}*/
