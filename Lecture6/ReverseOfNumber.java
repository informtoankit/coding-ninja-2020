/*
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Input format :

Integer N

Constraints:

Time Limit: 1 second

Output format :

Corresponding reverse number

Constraints:

N is always greater than or equal to 0

Sample Input 1 :

1234

Sample Output 1 :

4321

Sample Input 2 :

1980

Sample Output
*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int number =s.nextInt();
    int remember = 0;
    int r = 0;
    while (number != 0)
      {
	int digit = number % 10;
	  remember = remember * 10 + digit;
	  number = number / 10;
      }
    System.out.println(remember);
  }
}
