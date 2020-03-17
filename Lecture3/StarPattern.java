import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
      int   i=1;
        while(i<=n)
        {
            int j=0;
            while(j<n-i)
            {
                System.out.print(" ");
                j=j+1;

            }
            int k=0;
            while(k<(i*2)-1)
            {
                System.out.print("*");
                k=k+1;
            }
            System.out.println();
            i=i+1;

        }

  }

}
