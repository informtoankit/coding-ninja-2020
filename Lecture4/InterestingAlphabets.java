
/*
Input: 5

Output:
 
E
DE
CDE
BCDE
ABCDE
*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int  i=n;

        while(i>=1)
        {
           int j=i;
            while(j<=n)
            {
            char ch =(char)('A' + j-1);
                System.out.print((char)(ch));
                ch=(char)(ch-1);
                j=j+1;

            }
            System.out.println();
            i=i-1;

        }


	}

}
