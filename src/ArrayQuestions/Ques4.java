package ArrayQuestions;

class Solution4{

    public int richCus(int[][] accounts){
        int greaterValue = 0;
        for(int[] acc: accounts){
            int sum = 0;
            for(int i = 0 ; i < acc.length ; i++){
                sum += acc[i];
            }
            if(greaterValue < sum){
                greaterValue = sum;
            }
        }
        return greaterValue;
    }
}

public class Ques4 {
    public static void main(String[] args){
        Solution4 obj = new Solution4();
        int accounts[][] = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(obj.richCus(accounts));
    }
}
