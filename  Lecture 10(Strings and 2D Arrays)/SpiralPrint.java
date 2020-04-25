/*
Given an N*M 2D array, print it in spiral form. That is, first you need to print the 1st row, then last column, then last row and then first column and so on.
Print every element only once.
Input format :

Line 1 : N and M, No. of rows & No. of columns (separated by space) followed by N*M  elements in row wise fashion.

Output format :

Elements of matrix in spiral form in a single line and space separated

Constraints :

0 <= N <= 10^4
0 <= M <= 10^4

Sample Input 1:

 4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

Sample Output 1:

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Sample Input 2:

 3 3 1 2 3 4 5 6 7 8 9

Sample Output 2:

1 2 3 6 9 8 7 4 5


*/
public class solution {

	public static void spiralPrint(int matrix[][]){

		// Write your code here
   int rowStart=0;
   int rowLength=matrix.length-1;

  int colStart=0;
  int colLength = matrix[0].length-1;

  while(rowStart <= rowLength && colStart <= colLength){

   for (int i = rowStart; i <= colLength; i++) {
    System.out.print(matrix[rowStart][i] + " ");
   }

   for (int j = rowStart+1; j <= rowLength; j++) {
    System.out.print(matrix[j][colLength] + " ");
   }

   if(rowStart+1 <= rowLength){
    for (int k = colLength-1; k >= colStart; k--) {
     System.out.print(matrix[rowLength][k] + " ");
    }
   }
   if(colStart+1 <= colLength){
    for (int k = rowLength-1; k > rowStart; k--) {
     System.out.print(matrix[k][colStart] + " ");
    }
   }

   rowStart++;
   rowLength--;
   colStart++;
   colLength--;
  }
    }
}

// write the main body
