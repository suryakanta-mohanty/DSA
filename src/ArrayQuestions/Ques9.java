/*
    Given two arrays of integers nums and index. Your task is to create target array
    under the following rules:

    1. Initially target array is empty.
    2. From left to right read nums[i] and index[i], insert at index index[i] the value nums[i]
       in target array.
    3. Repeat the previous step until there are no elements to read in nums and index.

    Return the target array.
    It is guaranteed that the insertion operations will be valid.

    Example 1:

    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    Output: [0,4,1,3,2]
    Explanation:
    nums       index     target
    0            0        [0]
    1            1        [0,1]
    2            2        [0,1,2]
    3            2        [0,1,3,2]
    4            1        [0,4,1,3,2]

*/

package ArrayQuestions;
import java.util.Arrays;

class Solution9{
    public int[] createTargetArray(int[] nums, int[] index){
        int arrLen = nums.length;
        int[] target = new int[arrLen];
        for(int i = 0 ; i < arrLen ; i++){
            int insertPos = index[i];

            for(int j = i ; j > insertPos ; j--){
                target[j] = target[j - 1];
            }
            target[insertPos] = nums[i];

        }

        return target;
    }
}

public class Ques9 {
    public static void main(String[] args){
        Solution9 obj = new Solution9();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(obj.createTargetArray(nums, index)));
    }
}
