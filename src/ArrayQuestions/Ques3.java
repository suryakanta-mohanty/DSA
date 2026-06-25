/*
    Running Sum of 1d Array:

    Given an array nums. We define a running sum of an array as
    runningSum[i] = sum(nums[0] … nums[i]).
    Return the running sum of nums.

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

package ArrayQuestions;
import java.util.Arrays;

class Solution3{
    public int[] buildArray(int[] nums){
        /*
        int prev = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = prev + nums[i];
            prev = nums[i];
        }

        */

        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

public class Ques3 {
    public static void main(String[] args){
        Solution3 obj = new Solution3();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(obj.buildArray(nums)));
    }
}
