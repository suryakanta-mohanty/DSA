/*
    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation:
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1).
    For nums[3]=2 there exist one smaller number than it (1).
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/

package ArrayQuestions;
import java.util.Arrays;

class Solution8{
    public int[] smallerNumbersThanCurrent(int[] nums){
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0 ; i < len ; i++){
            int count = 0;
            for(int j = 0 ; j < len ; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

public class Ques8 {
    public static void main(String[] args){
        Solution8 obj = new Solution8();
        int[] nums = {6, 5, 4, 8};
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
    }
}
