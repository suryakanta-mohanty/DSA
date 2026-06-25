package ArrayQuestions;
import java.util.Arrays;

class Solution2{
    public int[] buildArray(int[] nums){
        int[] ans = new int[2*(nums.length)];

        /*
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(i == 0){
                    ans[j] = nums[j];
                }

                if(i == 1){
                    ans[nums.length + j] = nums[j];
                }
            }
        }

        */

        for(int i= 0 ; i < nums.length ; i++){
            ans[i] = nums[i];
            ans[ nums.length + i] = nums[i];
        }
        return ans;
    }
}

public class Ques2 {
    public static void main(String[] args){
        Solution2 obj = new Solution2();
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(obj.buildArray(nums)));
    }
}
