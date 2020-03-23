import java.util.Scanner;
class DecimalToBinary{

    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      System.out.println(Integer.toBinaryString(n));
    }
}


/*
logic for decimal to binary

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int number =s.nextInt();
    int binary  = 0;
    int pow = 1;
    while (number > 0)
      {
	int last = number % 2;
	  binary = binary+ last*pow;
	  pow=pow*10;
	  number = number / 2;
      }
    System.out.print(binary);
  }
}



*/
