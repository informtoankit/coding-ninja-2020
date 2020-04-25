/*
Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.
Input Format :

Line 1 : Two integers M and N (separated by space)
Line 2 : Matrix elements of each row (separated by space)

Output Format :

Sum of every ith row elements (separated by space)

Constraints :

0 <= N <= 10^4
0 <= M <= 10^4

Sample Input 1:

4 2
1 2 3 4 5 6 7 8

Sample Output 1:

3 7 11 15

Sample Input 2:

2 5
4 5 3 2 6 7 5 3 8 9

Sample Output 2:

20 32


*/
import java.util.Scanner ;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
    //    System.out.println("size of row");
        int row=s.nextInt();
      //  System.out.println("size of cols");
        int cols=s.nextInt();
        int input[][]=new int[row][cols];

        for(int i  = 0 ;  i < row  ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                input[i][j]=s.nextInt();

            }
        }

            int ans = 0;
            for(int k = 0; k < row; k++ )
            {
                ans  = 0 ;
                for(int l = 0 ; l< cols; l++)
                {
                   ans  =ans + input[k][l];

                }
                System.out.print(ans+" ");
            }
    }
}
//write the main body
