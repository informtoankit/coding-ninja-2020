/*
Sample Input :

3

Sample Output :

      1
     12
    123


*/
import java.util.Scanner;
public class Solution{

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int  i=1;
     while(i<=n)
        {
          int  k=1;
            while(k<=n-i)
            {

            System.out.print(" ");
            k=k+1;
            }
          int j=1;
            while(j<=i)
            {
          System.out.print(j);

                j=j+1;

            }
            System.out.println();
            i=i+1;
         }
    }

}
