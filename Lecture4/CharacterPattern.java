/*
Sample Input :

5

Sample Output :

A
BC
CDE
DEFG
EFGHI


*/
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int  i=1;

        while(i<=n)
        {
         char ch =(char)('A'+ i-1);
            int j=1;
            while(j<=i)
            {
            System.out.print(ch);
                ch=(char)(ch+1);
                  j=j+1;

            }
            System.out.println();
            i=i+1;

        }


	}

}
