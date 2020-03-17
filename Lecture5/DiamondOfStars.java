/*DiamondOfStars
Sample Input :

5

Sample Output :

  *
 ***
*****
 ***
  *


*/
import java.util.Scanner;
public class DiamondOfStars
{
	public static void main(String[] args) {

	 Scanner s=new Scanner(System.in);
     int n = s.nextInt();
     diamondOfStars(n);

	}

	public static void diamondOfStars(int n){
	    int mid = n/2 +1;

         int i = 1;
         while(i<=mid)
         {
             int j=1;
             while(j<=mid-i)
             {
                 System.out.print(" ");
                 j=j+1;
             }

             j=1;

             while(j<=2*i-1)
             {
                 System.out.print("*");
                 j=j+1;
             }

             System.out.println();
             i++;

         }

         int k=n-mid;
         i=k;
         while(i>=1)
         {
             int j=1;
             while(j<=mid-i)
             {
                 System.out.print(" ");
                 j=j+1;
             }

             j=1;
             while(j<=2*i-1)
             {
                 System.out.print("*");
                 j=j+1;
             }
             System.out.println();
             i=i-1;
         }

	}
}
