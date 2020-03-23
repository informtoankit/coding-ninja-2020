import java.util.Scanner;
public class SqaureRoot
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n =s.nextInt();
 int r =0;
 while(r*r <= n)
 {
     r = r +1;
 }
 r = r - 1;
 System.out.println(r);
  }
}
/*
with square root function
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n =s.nextInt();
 System.out.println((int)(Math.sqrt(n)));
  }
}



*/
