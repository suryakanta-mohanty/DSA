package ArrayQuestions;
import java.util.Arrays;

class Solution1{
    public int[] arrayReturn(int[] nums){
       /*
       int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
       */

        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int newValue = nums[nums[i]] % n;
            nums[i] = nums[i] + n * newValue;
        }
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] / n;
        }
        return nums;
    }
}

public class ArrQues1 {
    public static void main(String[] args){
        Solution1 obj = new Solution1();
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(obj.arrayReturn(nums)));
    }
}
