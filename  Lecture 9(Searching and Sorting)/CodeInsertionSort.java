/*
Given a random integer array. Sort this array using insertion sort.
Change in the input array itself. You don't need to return or print elements.


Input format :

Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)

Output format :

Elements of array in sorted order. Print them in a single line and space-separated

Constraints :

0 <= N <= 10^4

Sample Input 1:

7
2 13 4 1 3 6 28

Sample Output 1:

1 2 3 4 6 13 28

Sample Input 2:

5
9 3 6 2 0

Sample Output 2:

0 2 3 6 9


*/
public class InsertionSort {
	//arr is the input array you have to sort
	public static void insertionSort(int[] arr){

        int n = arr.length;
        for (int i = 1; i < n; ++i)
        {
            int tempvar = arr[i];
            int j = i - 1;
          while (j >= 0 && arr[j] > tempvar) {
                arr[j + 1] = arr[j];
                j = j - 1;
        }
            arr[j + 1] = tempvar;
        }

	}
}

// write the main body
