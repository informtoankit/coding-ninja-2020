/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
N varies from 1 to 1000.
Input format :

Integer x

Output format :

Terms of series (separated by space)

Sample Input 1 :

10

Sample Output 1 :

5 11 14 17 23 26 29 35 38 41

Sample Input 2 :

4

Sample Output 2 :

5 11 14 17


*/

import java.util.Scanner;
public class TermsOfAP
{
public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i;
    int count = 0;
    for (i = 1; ;i++)
    {
        int value = 3 * i + 2;

        if ( value % 4 !=0) {
            System.out.print(value + " ");
            count++;
        }
        if (count == n){
            break;
        }
    }
  }
}
