/*
    Lucky Numbers in a Matrix:
    Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

    A lucky number is an element of the matrix such that it is the minimum element in its row and
    maximum in its column.

    Example 1:

    Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
    Output: [15]
    Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in
    its column.
*/


package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

class Solution23{
    public List<Integer> luckyNumber(int[][] matrix){
        List<Integer> luckyNum = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0 ; i < rows ; i++){
            int minRow = matrix[i][0];
            int minColIndex = 0;

            for(int j = 1 ; j < cols ; j++){
                if(matrix[i][j] < minRow){
                    minRow = matrix[i][j];
                    minColIndex = j;
                }
            }

            boolean isMaxInCol = true;
            for(int row = 0 ; row < rows ; row++){
                if(matrix[row][minColIndex] > minRow){
                    isMaxInCol = false;
                    break;
                }
            }

            if(isMaxInCol){
                luckyNum.add(minRow);
            }
        }

        return luckyNum;
    }
}

public class Ques23 {
    public static void main(String[] a){
        Solution23 obj = new Solution23();
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        System.out.println(obj.luckyNumber(matrix));
    }
}
