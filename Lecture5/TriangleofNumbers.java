/*
Sample Input :

5

Sample Output :

         1
        232
       34543
      4567654
     567898765


*/
import java.util.*;
public class TriangleofNumbers {    
public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();

   int  i=1;


     while(i<=n)//1 and 4
        {
          int  k=1;

                    while(k<=n-i)
                    {

                    System.out.print(" ");
                    k=k+1;
                       }
            int val=i;

            int j=1;

                         while(j<=i)
                        {
                          System.out.print(val);
                          j=j+1; // j=2
                          val=val+1; // val = 2

                        }


            j=1;
            val=val-2;
            while(val>=i)
            {
                System.out.print(val);
                val=val-1;

                j=j+1;
            }
            System.out.println();
            i=i+1;
         }
    }

}
