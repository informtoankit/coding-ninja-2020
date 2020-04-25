/*
You are given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array.
You need to change in the given array itself. So no need to return or print anything.
Input format :

Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)

Output format :

Sorted array elements in a single line separated by space

Constraints :

0 <= N <= 10^7

Sample Input 1:

7
0 1 1 0 1 0 1

Sample Output 1:

0 0 0 1 1 1 1

Sample Input 2:

8
1 0 1 1 0 1 0 1

Sample Output 2:

0 0 0 1 1 1 1 1


*/
public class SortBinaryArray{

	public static void sortBinaryArray(int[] arr)
    {
		int sum=0;
        for(int i=0;i<arr.length;i++)
        {sum=sum+arr[i];}
        for(int i=0;i<(arr.length-sum);i++)
        {arr[i]=0;}
        for(int i=(arr.length-sum);i<arr.length;i++)
        {arr[i]=1;}


	}
}
	//write the main body
