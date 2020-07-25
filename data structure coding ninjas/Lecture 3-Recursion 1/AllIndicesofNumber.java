/*
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4

*/

  public class Solution {
   private  static int[] checkNumber(int input[], int x , int startindex ) {
       /* If the start index reaches the
       // length of the array, then
        return empty array*/
     if(startindex == input.length){
         int[] output=new int[0];
         return output ;
     }
     /* Getting the recursive answer in
        ans array */
       int[] ans=checkNumber(input,x,startindex+1);

      /*If the element at start index is equal
       // to x then
       // (which is the answer of recursion) and then
        (which came through recursion)*/
       if(x== input[startindex])
     {
         int[] finalans=new int[ans.length+1];
           /*Put the start index in front
           of the array */
           finalans[0]=startindex;
           for(int i=0;i<ans.length;i++){
               /*Shift the elements of the array
               // one step to the right
               // and putting them in
               myAns array */
               finalans[i+1]=ans[i];
           }
           return finalans;

     }

           /*If the element at start index is not
           // equal to x then just simply return the
           answer which came from recursion. */
              return ans;

 }
       public static int[] allIndexes(int input[], int x) {
       return checkNumber(input,x,0);
   }
}
