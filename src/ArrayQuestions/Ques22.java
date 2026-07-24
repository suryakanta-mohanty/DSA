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

        /*

        // Optimal way of my first method.
        int index = 0;

        // Insert in pair like (1, -1), (2, -2), etc.
        for (int i = 1 ; i <= n/2 ; i++){
            arr[index++] = i;
            arr[index++] = -i;
        }

        */

        // Even more solution
        for (int i = 0 ; i < n/2 ; i++){
            arr[i] = i + 1;
            arr[n - 1 - i] = -(i + 1);  // it will add -ve value from last or right side.
        }
        return arr;
    }
}

public class Ques22 {
    public static void main(String[] a){
        Solution22 obj = new Solution22();
        int n = 5;
        System.out.println(Arrays.toString(obj.sumZero(n)));
    }
}
