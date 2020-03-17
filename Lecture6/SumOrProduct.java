/*
If user enters C is equal to -

 1 : Print sum of 1 to N numbers
 2 : Print product of 1 to N numbers
 Any other number : print -1

Input format :

Line 1 : Integer N
Line 2 : Choice C (1 or 2)

Sample Input 1 :

10
1

Sample Output 1 :

55

Sample Input 2 :

10
2

Sample Output 2 :

3628800

*/
import java.util.Scanner;

public class SumOrProduct 
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    //System.out.println("enter the number");
	    int n = s.nextInt();
	  //System.out.println("enter the choice");
	    int c = s.nextInt();
	    int sum = 0;
	    int product = 1;
	    if(c==1)
	    {
	        int  k =0;
	        while(k<=n)
	        {
	        sum = sum + k;
	           k++;
	        }
	        System.out.println(sum);
	    }
	    else if (c==2)
	    {
	        int p=1;
	        while(p<=n)
	        {
	        product = product * p;
	        p++;
	        }
	        System.out.println(product);
	    }


	    if(c!=1 && c!=2)
	    {
	        System.out.println(-1);
	    }

	  }
}
