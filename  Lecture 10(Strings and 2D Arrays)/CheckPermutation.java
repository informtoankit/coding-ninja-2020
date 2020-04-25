/*
Given two strings, check if they are permutations of each other. Return true or false.
Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
Note : Input strings contain only lowercase english alphabets.
Input format :

Line 1 : String 1
Line 2 : String 2

Sample Input 1 :

abcde
baedc

Sample Output 1 :

true

Sample Input 2 :

abc
cbd

Sample Output 2 :

false


*/
public class solution {

	public static boolean isPermutation(String input1, String input2) {

        int a=input1.length();
        int b=input2.length();
        int check[]=new int[255];
        if(a==b)
        {
            for(int i=0;i<a;i++)
            {
                int temp=(int)input1.charAt(i);
                check[temp]++;
            }
            for(int i=0;i<b;i++)
            {
            int temp=(int)input2.charAt(i);
            if(check[temp]!=0)
                  {
                    check[temp]--;
                  }else{
                  return false;
            }

        }
     //   return true;

     }
        return true;
    }
}


	//write the main body part
