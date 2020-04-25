/*
Given a random integer array and a number X. Find and print the triplets of elements in the array which sum to X.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
Input format :

Line 1 : Integer N (Array Size)
Line 2 : Elements of the Array separated by single space
Line 3 : Integer X

Output format :

Line 1 : Triplet 1 - Elements separated by single space
Line 2 : Triplet 2 - Elements separated by single space
Line 3 : and so on

Constraints :

0 <= N <= 10^3
0 <= x <= 100

Sample Input 1:

7
1 2 3 4 5 6 7
12

Sample Output 1:

1 4 7
1 5 6
2 3 7
2 4 6
3 4 5

Sample Input 2:

7
1 2 3 4 5 6 7
19

Sample Output 2:


 Explanation for Input 2:

Since there doesn't exist any triplet with sum equal to 19, nothing got printed.


*/
public class Solution{

    public static void sort(int a,int b,int c)
    {

        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
         for(int i=0;i<3;i++)
        {

                  for(int j=i+1;j<3;j++)
                 {  if(arr[i]>arr[j])
                     {int temp;
                     temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;}
                  }
         }

        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }

	public static void tripletSum(int[] input, int x){

        for(int i=0;i<input.length;i++)
                {

                  for(int j=i+1;j<input.length;j++)
                    {
                          for(int k=j+1;k<input.length;k++)
                            {

                                  if(x==(input[i]+input[j]+input[k]))
                                  {sort(input[i],input[j],input[k]);
                                 }
                          }
                    }

                }


	}
}
//write the main body 
