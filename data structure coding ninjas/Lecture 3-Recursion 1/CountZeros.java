/*
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
10204
Sample Output 1 :
2
Sample Input 2 :
708000
Sample Output 2 :
4
*/
public class solution {

    public static int countZerosRec(int num){
		 // Find index of first zero in given array
        //when 0 accur then the below fucnton will execute
        if(num % 10 == 0)
        return 1 + countZerosRec(num / 10);
        //if there is no 0 in the number then below function will execute

         else if (num / 10 == 0)
        return 0;
        else
        return countZerosRec(num / 10);
	}
}
/*
public static void main (String[] rgs)
{
int x = 1020809 ;

System.out.println(countZerosRec(x));
}
}*/
