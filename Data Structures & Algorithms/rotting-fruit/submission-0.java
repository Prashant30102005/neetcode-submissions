class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][] direction = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
        };
        while(!queue.isEmpty()&&fresh>0){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] dir:direction){
                    int nr = r+dir[0];
                    int nc = c+dir[1];
                    if(nr>=0&&nr<grid.length&&nc>=0&&nc<grid[0].length&&grid[nr][nc]==1){
                        grid[nr][nc] = 2;
                        queue.offer(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            minutes++;
        }
        return fresh==0?minutes:-1;
    }
}
