/*
Print the following pattern for given number of rows.
Input format :

Integer N (Total number of rows)

Output Format :

Pattern in N lines

Sample Input :

   5

Sample Output :

 5432*
 543*1
 54*21
 5*321
 *4321


*/
import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
		int i ;
        for(i=1;i<=n;i++)
        {
            int j = 0 ;
            while(j<n-i)
            {
                System.out.print(n-j);
                j=j+1;
            }
            System.out.print("*");
            int k = i-1;
            while(k>0)
            {
                System.out.print(k);
                k=k-1;
            }
            System.out.println();
        }

	}
}
