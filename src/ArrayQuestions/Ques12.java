package ArrayQuestions;

class Solution12{
    public int largestAltitude(int[] gain){
        int currentAltitude = 0;
        int maxAltitude = 0;
        for(int n: gain){
            currentAltitude += n;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }

        return maxAltitude;
    }
}

public class Ques12 {
    public static void main(String[] args) {
        Solution12 obj = new Solution12();
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(obj.largestAltitude(gain));
    }
}
