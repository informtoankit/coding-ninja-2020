/*
Given two sorted arrays of Size M and N respectively, merge them into a third array such that the third array is also sorted.
Input Format :

 Line 1 : Size of first array i.e. M
 Line 2 : M elements of first array separated by space
 Line 3 : Size of second array i.e. N
 Line 2 : N elements of second array separated by space

Output Format :

M + N integers i.e. elements of third sorted array in a single line separated by spaces.

Constraints :

0 <= M, N <= 10^6

Sample Input :

5
1 3 4 7 11
4
2 4 6 13

Sample Output :

1 2 3 4 4 6 7 11 13


*/

public class Solution {

	public static int[] merge(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans=new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
              ans[k]=arr1[i];
            	k++;
            	i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
            while(i < arr1.length)
            {
                ans[k]=arr1[i];
                i++;
                k++;
            }
            while(j < arr2.length)
           {
                ans[k]=arr2[j];
                k++;
                j++;

            }
            return ans;
        }
}
	/*
    public static void main (String[]args)
	  {
	    Scanner s = new Scanner (System.in);
	     System.out.println("enter array 1");
	    int size = s.nextInt ();

	    int[] arr1 = new int[size];
	    System.out.println("enter array 2");
	    int size1 = s.nextInt();
	    int[] arr2 =new int[size1];

	    for (int i = 0; i < size; i++)
	      {
		   arr1[i] = s.nextInt ();
	      }
	      for (int j = 0; j < size1; j++)
	      {
		   arr2[j] = s.nextInt ();
	      }
        int[] ans = merge(arr1,arr2);
	    for(int i = 0 ; i < ans.length; i++)
	    {
	        System.out.print(ans[i]+ " ");

	    }
	    System.out.println(" ");
	  }
}
    */
