class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] blockSet = new HashSet[9];
        for(int i = 0;i<9;i++){
            colSet[i] = new HashSet<>();
            rowSet[i] = new HashSet<>();
            blockSet[i] = new HashSet<>();
        }
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                int block = (i/3)*3+(j/3);
                if(board[i][j]=='.')continue;
                if(!colSet[i].add(board[i][j])||!rowSet[j].add(board[i][j])||!blockSet[block].add(board[i][j])) return false;
            }
        }
        return true;
    }
}
