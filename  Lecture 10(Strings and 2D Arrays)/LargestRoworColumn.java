/*
Given an NxM 2D array, you need to find out which row or column has largest sum (sum of its elements) overall amongst all rows and columns.
Input Format :

 Line 1 : 2 integers N and M respectively, separated by space
 Line 2: Single line having N*M elements entered in row wise manner, each separated by space.

Output Format :

 If row sum is maximum then - "row" row_num max_sum
 If column sum is maximum then - "column" col_num max_sum

Constraints :

0 <= N <= 10^4
0 <= M <= 10^4

Note : If there are more than one rows/columns with maximum sum consider the row/column that comes first. And if ith row and jth column has same sum (which is largest), consider the ith row as answer.
Sample Input 1 :

2 2
1 1 1 1

Sample Output 1 :

row 0 2

Sample Input 2 :

3 3
3 6 9 1 4 7 2 8 9

Sample Output 2 :

column 2 25


*/
/*import java.util.Scanner ;*/
public class Solution {
     /*   public static  int[][] takeinput()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the row size");
    int rows=s.nextInt();
    System.out.println("enter the cols size");
    int cols=s.nextInt();
    int input[][]=new int[rows][cols];
    for(int i  = 0 ; i < rows ; i++)
    {
        for(int j = 0 ; j < cols ; j++ )
        {
            input[i][j]=s.nextInt();

        }
    }
    return input;
    }*/

public static void findLargest(int input[][]){

 int sum=0,largestRow=Integer.MIN_VALUE,rowcount=0;
        for(int i=0;i<input.length;i++)
        {   sum=0;
            for(int j=0;j<input[0].length;j++)
            {
                sum+=input[i][j];
            }
            if(sum>largestRow){
                largestRow=sum;
                rowcount=i;
            }
         }
     int sum1=0,largestCol=Integer.MIN_VALUE,colcount=0;
        for(int j=0;j<input[0].length;j++)
        {   sum1=0;
            for(int i=0;i<input.length;i++)
            {
                sum1+=input[i][j];
            }

            if(sum1>largestCol){
                largestCol=sum1;
                colcount=j;
            }
        }


	if(largestRow>=largestCol)
    {
        System.out.print("row "+rowcount+" "+largestRow);

    }
    else if(largestRow<largestCol){
         System.out.print("column "+colcount+" "+largestCol);

    }
}
}




    /*
     	public static void main(String[] args) {
	    int[][] input=takeinput();
	    findLargest(input);
	   // print(input);
	   // System.out.println(largestsumcol(input));
	}
}
*/
