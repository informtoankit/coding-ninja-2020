import java.util.Scanner;
//import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int x=s.nextInt();
    int n=s.nextInt();
      int k =0;

    if(x>=0 && x<=8 || n>=0 && n<=9)
    {


         k=(int)(Math.pow(x, n));
     }
      System.out.println(k);

  }
}
