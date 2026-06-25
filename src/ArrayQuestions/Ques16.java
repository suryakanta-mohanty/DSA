package ArrayQuestions;

class Solution16{
    public int findNumbers(int[] nums){
        int evenNum = 0;
        for(int n: nums){
            /*
            int count = 0;
            while(n != 0){
                n /= 10;
                count++;
            }
            if(count % 2 == 0) evenNum++;
            */

            // handling edge case that is zero.
            int count = 1;
            while(n >= 10){
                n /= 10;
                count++;
            }
            if(count % 2 == 0) evenNum++;

            // for leetCode using it's constrain
            /*
            if(
                    (n >= 10 && n <= 99) ||
                            (n >= 1000 && n <= 9999) ||
                            (n == 100000 )
            ){
                evenNum++;
            }
            */

            /*
                -- Another solution using log10
                for(int i=0;i<nums.length;i++){
                    if(((int)(Math.log10(nums[i]))+1)%2 == 0) res++;
                }
            */
        }

        return evenNum;
    }
}

public class Ques16 {
    public static void main(String[] args) {
        Solution16 obj = new Solution16();
        int[] nums = {555,901,482,1771};
        System.out.println(obj.findNumbers(nums));
    }
}
