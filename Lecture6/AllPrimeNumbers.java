/*
All Prime Numbers
Sample Input :

9

Sample Output :

2
3
5
7
*/
import java.util.Scanner;

class AllPrimeNumbers
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int i,j,n,c;

     n=sc.nextInt();


 for(i=2;i<=n;i++)
     {
         c=0;
         for(j=1;j<=i;j++)
         {
        	     if(i%j==0)
        	     {
        	         c++;
        	     }
         }

       if(c==2)
       {
             System.out.println(i);
         }
     }
 }
}
