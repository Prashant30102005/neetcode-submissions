class Solution {
    public int backtrack(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        area += backtrack(grid,i+1,j);
        area += backtrack(grid,i-1,j);
        area += backtrack(grid,i,j+1);
        area += backtrack(grid,i,j-1);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int sum = backtrack(grid,i,j);
                    max = Math.max(max,sum);
                }
            }
        }
        return max;
    }
}
