/*
    Find N Unique Integers Sum up to Zero:

    Given an integer n, return any array containing n unique integers such that they add up to 0.

    Example 1:
    Input: n = 5
    Output: [-7,-1,1,3,4]
    Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
*/

package ArrayQuestions;
import java.util.Arrays;

class Solution22{
    public int[] sumZero(int n){
        int[] arr = new int[n];
        boolean nOdd = false;

        // My first method.
        if(n%2 != 0){
            n--;
            nOdd = true;
        }

        int nNeed = n/2;

        for (int i = 0 ; i < n ; i++){
            arr[i] = nNeed;

            if(i % 2 == 0){
                nNeed = -nNeed;

            } else{
                nNeed = -nNeed;
                nNeed++;
            }
        }

        if(nOdd){
            arr[n] = 0;
        }

        return arr;
    }
}

public class Ques22 {
    public static void main(String[] a){
        Solution22 obj = new Solution22();
        int n = 3;
        System.out.println(Arrays.toString(obj.sumZero(n)));
    }
}
