/*
Given a random integer array. Sort this array using bubble sort.
Change in the input array itself. You don't need to return or print elements.


Input format :

Line 1 : Integer N, Array Size
Line 2 : Elements of the array separated by single space

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

public class BubbleSort {

    public static void bubbleSort(int input[]){

	             for(int i = 0 ; i < input.length-1; i++)
	             {
	                int min = input[i];
	                int minindex = i;
	                for(int j = i + 1 ; j < input.length ; j++)
	                {
	                    if(input[i] > input[j] )
	                    {
	                       int newvar = input[j];
	                       input[j]=input[i];
	                       input[i]=newvar;
	                    }
                    }
                 }
    }
}
/*
public static void main (String[]args)
	  {
	    Scanner s = new Scanner (System.in);
	    int size = s.nextInt ();
	    int[] arr = new int[size];

	    for (int i = 0; i < size; i++)
	      {
		   arr[i] = s.nextInt ();
	      }
         bubblesort(input);
	    for(int i = 0 ; i < arr.length; i++)
	    {
	        System.out.print(arr[i]+ " ");

	    }
	  }
}

*/







    
