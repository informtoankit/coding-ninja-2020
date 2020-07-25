/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
using recursion.
Input format :
Integer k
Output format :
Geometric sum
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.875
Sample Input 2 :
4
Sample Output 2 :
1.93750
*/

public class solution {

    public static double findGeometricSum(int k){

       if(k==0){
           return 1;
       }
        double sum=1/Math.pow(2,k);
        k--;
        int ans=sum+ findGeometricSum(k);
        return sum;
	}
}
	/*public static void main (String[] rgs)
{
int x = 3 ;

System.out.println(findGeometricSum(x));
}
}
	*/
