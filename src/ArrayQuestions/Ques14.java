package ArrayQuestions;

class Solution14{
    public int oddCells(int m, int n, int[][] indices){
        /*
        int[][] mat = new int[m][n];
        for(int[] ind: indices){
            int r = ind[0], c = ind[1];
            for(int i = 0 ; i < n ; i++){
                mat[r][i] += 1;
            }
            for(int i = 0 ; i < m ; i++){
                mat[i][c] += 1;
            }
        }

        int count = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] % 2 != 0) count++;
            }
        }
        */

        // optimized
        /*
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        for(int[] ind: indices){
            int r = ind[0], c = ind[1];
            rowCount[r] += 1;
            colCount[c] += 1;
        }
        int count = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if((rowCount[i] + colCount[j]) % 2 != 0){
                    count++;
                }
            }
        }

        return count;
        */

        // more smart solution
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for(int[] ind: indices){
            int r = ind[0], c = ind[1];
            rowCount[r] ++;
            colCount[c] ++;
        }

        int oddRow = 0, evenRow = 0;
        for(int r: rowCount){
            if(r % 2 == 0) evenRow++;
            else oddRow++;
        }

        int oddCol = 0, evenCol = 0;
        for(int c: colCount){
            if(c % 2 == 0) evenCol++;
            else oddCol++;
        }

        return ((oddRow * evenCol) + (evenRow * oddCol));
    }
}

public class Ques14 {
    public static void main(String[] args) {
        Solution14 obj = new Solution14();
        int m = 2, n = 3;
        int[][] indices = {{0,1}, {1,1}};
        System.out.println(obj.oddCells(m, n, indices));
    }
}
