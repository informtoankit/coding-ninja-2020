/*
Sample Input :
7
Sample Output :
7777777
7777777
7777777
7777777
7777777
7777777
7777777
*/
import java.util.Scanner;
 public class Solution
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int i =1;

  while(i<=n)
  {
      int j = 0;
      while(j<n)
      {
      System.out.print(n);
      j=j+1;
      }

  System.out.println();
  i=i+1;
  }

  }
}
