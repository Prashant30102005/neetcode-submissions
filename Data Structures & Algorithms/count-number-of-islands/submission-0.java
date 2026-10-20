class Solution {
    public void sink(int i,int j,char[][] grid){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0')return;
        grid[i][j]='0';
        sink(i+1,j,grid);
        sink(i-1,j,grid);
        sink(i,j+1,grid);
        sink(i,j-1,grid);
    }
    public int numIslands(char[][] grid) {
        int total = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    total++;
                    sink(i,j,grid);
                }
            }
        }
        return total;
    }
}
