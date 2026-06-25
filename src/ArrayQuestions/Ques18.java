package ArrayQuestions;
import java.util.*;

class Solution18{
    public List<Integer> addToArrayForm(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            int sum = nums[i] + k;
            result.add(sum % 10);
            k = sum / 10;
        }
        while(k > 0){
            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}

public class Ques18 {
    public static void main(String[] args){
        Solution18 obj = new Solution18();
        int[] nums = {2,7,4};
        int k = 181;
        System.out.println(obj.addToArrayForm(nums, k));
    }
}
