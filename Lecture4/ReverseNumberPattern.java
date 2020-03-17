/*
Sample Input :

5

Sample Output :
1
21
321
4321
54321
*/
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int  i=1;
        while(i<=n)
        {
            int j=0;
            while(j<i)
            {
                System.out.print(i-j);
                j=j+1;

            }
            System.out.println();
            i=i+1;

        }


	}

}
