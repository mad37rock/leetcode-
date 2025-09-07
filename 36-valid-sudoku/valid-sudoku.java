class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        Set<String> map=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    String b="("+board[i][j]+")";
                    if(map.add(b+i)==false || map.add(j+b)==false || map.add(i/3+b+j/3)==false ){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}