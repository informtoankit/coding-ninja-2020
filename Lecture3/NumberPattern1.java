import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i = 0;
        int val = 0;
        while(i<=n)
        {
            val=i;
          int  j=1;
            while(j<=i)
            {
                System.out.print(val);
                val=val+1;
                j=j+1;

            }
        System.out.println();
            i=i+1;
        }


	}

}
