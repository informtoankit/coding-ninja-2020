import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int result = fib(n);
	    System.out.println(result);
	}

	    public static int fib( int n){
	        if (n == 0)
            {
                return n;
            } else if (n == 1 || n == 2)
            {
	           return 1;
	        }
	        return fib(n-1) + fib(n-2);

	        }


}
