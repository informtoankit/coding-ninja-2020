import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int a =(int)c;
        if(c>=65 && c<=90)
        {
            System.out.println("1");

        }
    else if(c>=90 && c<=122)
{
    System.out.println("0");
}
	else
    {
        System.out.println(-1);
    }
}
}
