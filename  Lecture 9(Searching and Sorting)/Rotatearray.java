/*
Given a random integer array of size n, write a function that rotates the given array by d elements (towards left)
Change in the input array itself. You don't need to return or print elements.
Input format :

Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer d

Output Format :

Updated array elements in a single line (separated by space)

Constraints :

0 <= N <= 10^7
0 <= d <= N

Sample Input 1:

7
1 2 3 4 5 6 7
2

Sample Output 1:

3 4 5 6 7 1 2

Sample Input 2:

7
1 2 3 4 5 6 7
0

Sample Output 2:

1 2 3 4 5 6 7


*/

public class ArrayRotate {

public static void rotate(int[] arr, int d) {

        for(int j=1;j<=d;j++){
        for(int i=0; i<arr.length-1;i++){
              int temp;
                temp=arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }


        }


	}
}
/*
public static void main (String[] args)
	  {
	    Scanner s = new Scanner (System.in);
	     System.out.println("enter array 1");
	     int d=s.nextInt();
	     System.out.println("enter array 1");
	    int size = s.nextInt ();

	  int[] arr = new int[size];

	   for(int i = 0; i < size; i++)
	    {
	        arr[i] = s.nextInt();

	    }
	   push(arr,d);
	    for(int i = 0 ; i < size ; i++)
	    {
	        System.out.print(arr[i]+ " ");

	    }
	    System.out.println(" ");
	  }
}*/
