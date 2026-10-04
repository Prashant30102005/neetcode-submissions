class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        backtrack(0,board);
        return res;
    }
    public boolean isValid(int r,int c,char[][] board){
        for(int i = r-1;i>=0;i--){
            if(board[i][c]=='Q')return false;
        }
        for(int i = r-1,j = c-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i = r-1,j = c+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    public void backtrack(int r,char[][] board){
        if(r==board.length){
            List<String> strs = new ArrayList<>();
            for(char[] chars:board){
                strs.add(new String(chars));
            }
            res.add(strs);
            return;
        }
        for(int c = 0;c<board.length;c++){
            if(isValid(r,c,board)){
                board[r][c] ='Q';
                backtrack(r+1,board);
                board[r][c] = '.';
            }
        }
    }
}
