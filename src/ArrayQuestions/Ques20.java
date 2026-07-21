package ArrayQuestions;

import java.util.Arrays;

class Solution20{
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int rotation = 0 ; rotation < 4 ; rotation++) {
            if (isEqual(mat, target)) {
                    return true;
            }

            mat = rotate90(mat);
        }

        return false;

    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n =mat.length;

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    private int[][] rotate90(int[][] mat){
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j= 0 ; j < n ; j++){
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }

        return rotated;
    }
}
public class Ques20 {
    public static void main(String[] a){
        Solution20 obj = new Solution20();
        int[][] mat = {{0, 1}, {1, 1}};
        int[][] target = {{1, 0}, {0, 1}};
        System.out.println(obj.findRotation(mat, target));
    }
}
