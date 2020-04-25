/*
Given a random integer array, push all the zeros that are present to end of the array. The respective order of other elements should remain same.
Change in the input array itself. You don't need to return or print elements. Don't use extra array.
Note : You need to do this in one scan of array only.


Input format :

Line 1 : Integer N, Array Size
Line 2 : Elements of the array separated by a single space.

Output Format :

Array elements in a single line (separated by single space)

Constraints :

0 <= N <= 10^7

Sample Input 1:

7
2 0 4 1 3 0 28

Sample Output 1:

2 4 1 3 28 0 0

Sample Input 2:

5
0 3 0 2 0

Sample Output 2:

3 2 0 0 0


*/
public class PushZerosAtEnd {

	public static void pushZerosAtEnd(int[] arr){
	    int j = 0 ;
	    int i = 0;

	    while(i < arr.length)
	    {
	        if(arr[i] != 0)
	        {
	            int temp = 0;
	            temp = arr[i];
	            arr[i]= arr[j];
	            arr[j]= temp ;
	            i++;
	            j++;
	        }
	        if(arr[i] == 0)
	            i++;
	        }
	       // return arr ;
	 	}
}
/*
public static void main (String[] args)
	  {
	    Scanner s = new Scanner (System.in);
	     System.out.println("enter array 1");
	    int size = s.nextInt ();
	  int[] arr = new int[size];
	   for(int i = 0; i < size; i++)
	    {
	        arr[i] = s.nextInt();

	    }
	   push(arr);
	    for(int i = 0 ; i < size ; i++)
	    {
	        System.out.print(arr[i]+ " ");

	    }
	    System.out.println(" ");
	  }
}
*/
