class Solution {
    public void rotate(int[][] matrix) {

        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[j][matrix.length-1-i]=copy[i][j];
            }
        }
    }
}