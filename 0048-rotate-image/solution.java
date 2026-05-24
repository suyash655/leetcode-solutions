class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

                

            }
        }

        for(int i=0;i<row;i++){

            int s=0;
            int e=row-1;
            while(s<e){
             int temp=matrix[i][s];
             matrix[i][s]=matrix[i][e];
             matrix[i][e]=temp;
             s++;
             e--;


            }
        }
        
    }
}
