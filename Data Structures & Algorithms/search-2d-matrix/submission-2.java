class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        //matrix 
        //column checks
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // 1D array schema.
        int low = 0;
        int high = (rows*cols)-1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;

            int row = mid/cols;
            int col = mid%cols;

            int midElement = matrix[row][col];
            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
        
    }
}
