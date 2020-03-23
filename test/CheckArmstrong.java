/*
Feedback
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,

371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

Input Format :

Integer n

Output Format :

true or false

Sample Input 1 :

1

Sample Output 1 :

true

Sample Input 2 :

103

Sample Output 2 :

false


*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n = z.nextInt();
        int f = n ;
        int h = n ;
        int count = 0 ;
        int k =0 ;
        int s = 1 ;
        int p = 0 ;
        while(h!=0)
        {
            h=h/10;
            count++;
        }
        while(n!=0)
        {
            int m = count ;
            k = n%10;
            while(m!=0)
            {
                s=s*k;
                m--;
            }
            p=p+s;
            s=1;
            n=n/10;
        }
        if(p==f)
        {
            System.out.println("true ");
        }
        else
        {
            System.out.println("false");
        }

	}
}
