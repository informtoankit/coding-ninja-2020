import java.util.Scanner;
//import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    int oddsum=0;
    int evensum=0;
    int i=0;
    int r =0;
    while(n!=0)
    {
       // n=n/10;
        r=n%10;
        if(r%2!=0)
        {
        oddsum=oddsum + r;

        }
        else
        {
            evensum=evensum + r;

        }
     n=n/10;
       i=i+1;

    }
    System.out.println(evensum + " " + oddsum);
  }
}
