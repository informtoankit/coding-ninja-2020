import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.next();
        char c=name.charAt(0);
        int mark1=s.nextInt();
        int mark2=s.nextInt();
        int mark3=s.nextInt();
        int d = (mark1+mark2+mark3)/3;
            System.out.println(c);
        System.out.println(d);


		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/


	}

}
