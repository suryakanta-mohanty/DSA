package ArrayQuestions;
import java.util.Arrays;

class Solution17{
    public int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];

        for(int r = 0 ; r < rows ; r++){
            for(int c = 0 ; c < cols ; c++){
                trans[c][r] = matrix[r][c];
            }
        }
        return trans;
    }
}

public class Ques17 {
    public static void main(String[] a){
        Solution17 obj = new Solution17();
        int[][] matrix = {{1,2,3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(obj.transpose(matrix)));
    }
}
