/*
    Determine Whether Matrix Can Be Obtained By Rotation.

    Given two n x n binary matrices mat and target, return true if it is possible to make mat equal
    to target by rotating mat in 90-degree increments, or false otherwise.

    Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
*/

package ArrayQuestions;

class Solution20{
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int rotation = 0 ; rotation < 4 ; rotation++) {

            if (isEqual(mat, target)) {
                    return true;
            }

            rotate90(mat); // no need of variable, the element will swap in place.
        }

        return false;

    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++){

                if(mat[i][j] != target[i][j]){
                    return false;
                }

            }
        }

        return true;
    }

    private void rotate90(int[][] mat){
        int n = mat.length;

        // Step 1: Transpose
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse every row.
        for(int i = 0 ; i < n ; i++){
            int left = 0;
            int right = n - 1;

            while(left < right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
public class Ques20 {
    public static void main(String[] a){
        Solution20 obj = new Solution20();
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(obj.findRotation(mat, target));
    }
}
