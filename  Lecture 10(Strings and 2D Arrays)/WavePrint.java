/*
Given a two dimensional N*M array, print the array in a sine wave order. i.e. print the first column top to bottom, next column bottom to top and so on.
Note : Print the elements separated by space.
Input format :

N, M, array elements (separated by space)

Output format :

Elements of matrix in wave form in a single line and space separated

Constraints :

0 <= N <= 10^4
0 <= M <= 10^4

Sample Input 1:

3 4 1  2  3  4 5  6  7  8 9 10 11 12

Sample Output 1:

1 5 9 10 6 2 3 7 11 12 8 4

Sample Input 2:

5 3 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

Sample Output 2:

1 4 7 10 13 14 11 8 5 2 3 6 9 12 15


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
