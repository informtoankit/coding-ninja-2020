/*
Feedback
Print the following pattern
Pattern for N = 4

*000*000*
0*00*00*0
00*0*0*00
000***000

Input Format :

N (Total no. of rows)

Output Format :

Pattern in N lines

Sample Input 1 :

3

Sample Output 1 :

*00*00*
0*0*0*0
00***00

Sample Input 2 :

5

Sample Output 2 :

*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000


*/
import java.util.*;
public class Solution{

	public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<N+1;i++)
        {

                     for(int k=i-1;k>0;k--)
                    {
                        System.out.print("0");
                    }
                    System.out.print("*");

                    for(int j=0;j<N-i;j++)
                    {
                        System.out.print("0");
                    }
                    System.out.print("*");
                     for(int j=0;j<N-i;j++)
                    {
                        System.out.print("0");
                    }
                     System.out.print("*");
                     for(int k=i-1;k>0;k--)
                    {
                        System.out.print("0");
                    }




        System.out.println("");
        }



    }

}
