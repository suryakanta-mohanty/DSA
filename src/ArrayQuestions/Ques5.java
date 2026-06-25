package ArrayQuestions;
import java.util.Arrays;

class Solution5{
    public int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        int index = 0;
        for(int i=0 ; i<n ; i++){
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }
        return ans;
    }
}

public class Ques5 {
    public static void main(String[] args){
        Solution5 obj = new Solution5();
        int[] nums= {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(obj.shuffle(nums, n)));
    }
}
