/*
Given an array/list of length N, you need to find and return the sum of all the elements int the array/list.
Input Format :

Line 1 : An Integer N i.e. size of array/list
Line 2 : N integers which are elements of the array/list, separated by single space.

Output Format :

Sum of the numbers in the array/list

Constraints :

0 <= N <= 10^7

Sample Input 1:

3
9 8 9

Sample Output 1:

26

Sample Input 2:

4
2 3 5 1

Sample Output 2:

11


*/
public class Solution{
    public static int sum(int[] input){
        int sum = 0 ;
        for(int i = 0; i < input.length; i++)
        {
        sum=sum+input[i];
        }
        return sum;
    }
}

//write the main body 
