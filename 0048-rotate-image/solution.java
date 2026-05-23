class Solution {
    public void rotate(int[][] matrix) {

        int row=matrix.length;
        int col=matrix[0].length;
        int[][] max=new int[row][col];
        int m=0;
        int l=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
          max[m][row-l-1]=matrix[i][j];
          m++;
            }
            l++;
            m=0;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=max[i][j];
            }
        }
        
    }
}
