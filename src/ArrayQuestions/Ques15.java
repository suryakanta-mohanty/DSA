package ArrayQuestions;

class Solution15{
    public int diagonalSum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        /*
        int i = 0, j = mat[i].length - 1;
        for(int n[]: mat){
            if(i != j){
                sum += (n[i] + n[j]);
                i++;
                j--;

            } else{
                sum+= n[i];
                i++;
                j--;
            }
        }
        */

        // more cleaner solution
        for(int i = 0; i < n ; i++){
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];

        }

        if(n % 2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}

public class Ques15 {
    public static void main(String[] args) {
        Solution15 obj = new Solution15();
        int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        System.out.println(obj.diagonalSum(mat));
    }
}
