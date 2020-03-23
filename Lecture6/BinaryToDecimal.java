/*
Given a binary number as an integer N, convert it into decimal and print.
Input format :

An integer N

Output format :

Corresponding Decimal number (as integer)

Sample Input 1 :

1100

Sample Output 1 :

12

Sample Input 2 :

111

Sample Output 2 :

7


*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int number =s.nextInt();
    int decimal = 0;
    int pow= 1;
    while (number != 0)
      {
	int last = number % 10;
	  decimal = decimal+ last*pow;
	  pow=pow*2;
	  number = number / 10;
      }
    System.out.println(decimal);
  }
}
