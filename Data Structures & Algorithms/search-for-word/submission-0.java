class Solution {
    public boolean backtrack(char[][] board, String word,int n,int row ,int col){
        if(n>=word.length())return true;
        if(row<0||col<0||row>=board.length||col>=board[0].length||word.charAt(n)!=board[row][col]){
            return false;
        }
        board[row][col] ='#';
        boolean res = backtrack(board,word,n+1,row,col-1)||backtrack(board,word,n+1,row-1,col)||
        backtrack(board,word,n+1,row,col+1)||backtrack(board,word,n+1,row+1,col);
        board[row][col] = word.charAt(n);
        return res;
    }
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(backtrack(board,word,0,i,j))return true;
                }
            }
        }
        return false;
    }
}
