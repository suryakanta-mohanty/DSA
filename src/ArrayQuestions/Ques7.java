package ArrayQuestions;

class Solution7{
    public int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i = 0 ; i < (nums.length - 1); i++){
            for(int j = (i + 1) ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

public class Ques7 {
    public static void main(String[] args){
        Solution7 obj = new Solution7();
        int[] num = {1, 1, 1, 1};
        System.out.println(obj.numIdenticalPairs(num));
    }
}
