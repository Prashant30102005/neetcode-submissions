class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r = col*row-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            if(matrix[midRow][midCol]==target){
                return true;
            }
            else if(matrix[midRow][midCol]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        } 
        return false; 
    }
}
