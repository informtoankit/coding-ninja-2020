/*
Given two random integer arrays of size M and N, print their intersection. That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.
Note : Order of the elements is not important


Input format :

Line 1 : Size of the first array
Line 2 : Elements of the first array separated by a single space.
Line 3 : Size of the second array
Line 4 : Elements of the second array separated by a single space.

Output format :

Print the intersection elements on different lines

Constraints :

0 <= M <= 10^4, and
0 <= N <= 10^4

Sample Input 1 :

6
2 6 8 5 4 3
4
2 3 4 7

Sample Output 1 :

2
4
3

Sample Input 2 :

4
2 6 1 2
5
1 2 3 4 2

Sample Output 2 :

2
2
1

Explanation for Sample Output 2 :

Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.


*/
public class Solution{

	public static void intersections(int[] input1, int[] input2){
        	//int sum = 0 ;

        for(int i = 0 ; i < input1.length ;i++)
         {

            for(int j = 0 ; j < input2.length ; j++)
            {
                if(input1[i] == input2[j])
                {
                 System.out.println(input1[i]);
                    input2[j]=Integer.MIN_VALUE;
                       break;
                }
            }

        }



	}
}
//write the main body 
