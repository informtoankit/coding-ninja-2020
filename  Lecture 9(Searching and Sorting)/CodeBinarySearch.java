/*
Given a sorted integer array (in ascending order) and an element "VAL". You need to search this element "VAL" in the given input array using Binary Search. Return the index of element in the input.
Indexing starts from 0.
Return -1 if "VAL" is not present in the input array.


Input format :

Line 1 : Integer N, Array Size
Line 2 : Elements of the array separated by single space
Line 3 : Element to be searched (i.e. VAL)

Output Format :

Index of 'VAL' if found. Otherwise, '-1'

Constraints :

0 <= N <= 10^8

Sample Input 1:

7
1 3 7 9 11 12 45
3

Sample Output 1:

1

Sample Input 2:

7
1 2 3 4 5 6 7
9

Sample Output 2:

-1


*/
public class BinarySearch{
	//arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num)
         {

    int start = 0;
    int end = arr.length - 1;
    while (start <= end)
      {
	 int mid = (start + end) / 2;
	  if (arr[mid]==num)
	  {
	    return mid;

	  }
	else if (arr[mid]<num)
	  {
	    start = mid + 1;
	  }
	else
	  {
	    end = mid - 1;
	  }
      }
    return -1;
  }
}
//   public static void main (String[]args)
//   {
//     Scanner s = new Scanner (System.in);
//     System.out.println ("enter the size of array ");
//     int size = s.nextInt ();
//     int[] arr = new int[size];
//     System.out.println ("enter the element of the arrray ");
//     int number;
//     for (int i = 0; i < size; i++)
//       {
// 	   arr[i] = s.nextInt ();
//       }
//     System.out.println ("enter the number you want to find ");
//     int num = s.nextInt ();
//     number = binarysearch (arr, num);
//     System.out.println(number);

//   }
// }
