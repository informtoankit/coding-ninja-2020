/*
Sample Input :

5

Sample Output :

55555
4444
333
22
1


*/
import java.util.Scanner;

public class Solution{


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=n;
      while(i <= n && i>0)
        {
          int j=1;
          while(j <= i)
            {
                System.out.print(i);
                j=j+1;
            }
            System.out.println();
            i = i-1;

            }
        }

}
