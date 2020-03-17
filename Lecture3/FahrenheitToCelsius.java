import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int S=k.nextInt();
        int E=k.nextInt();
        int W=k.nextInt();
        int C=0;
        while (S<=E)
        {
            C=(S-32)*5/9;
            System.out.println(S+ "\t" +C);
            S=S+W;
        }
    }
}
