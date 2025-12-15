class Solution {
    
        public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    
    boolean firstColZero = false;
    
    // Step 1: Check if first column has any zero
    for (int i = 0; i < m; i++) {
        if (matrix[i][0] == 0) {
            firstColZero = true;
            break;
        }
    }
    
    // Step 2: Mark rows and columns using first row/col
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;           // mark row i
                if (j > 0) {
                    matrix[0][j] = 0;       // mark col j (j>0)
                }
            }
        }
    }
    
    // Step 3: Zero out inner matrix (from i=1, j=1)
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }
    
    // Step 4: Handle first row
    if (matrix[0][0] == 0) {
        for (int j = 0; j < n; j++) {
            matrix[0][j] = 0;
        }
    }
    
    // Step 5: Handle first column
    if (firstColZero) {
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 0;
        }
    }
}

        
    }

