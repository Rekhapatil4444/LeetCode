class Solution {
    public void solve(int col,char [][]board,List<List<String>>ans,int []left,int []upd,int []ld,int n)
    {
        if(col==n)
        {
            ans.add(construct(board));
        }
        for(int row=0;row<n;row++)
        {
            if(left[row]==0 && ld[row+col]==0 && upd[n-1+col-row]==0)
            {
                board[row][col]='Q';
                left[row]=1;
                ld[row+col]=1;
                upd[n-1+col-row]=1;
                solve(col+1,board,ans,left,upd,ld,n);
                board[row][col]='.';
                left[row]=0;
                ld[row+col]=0;
                upd[n-1+col-row]=0;
            }
        }
    }
    public List<String> construct(char [][]board)
    {
        List<String> res=new ArrayList<>();
        for(char []row:board)
        {
            res.add(new String(row));

        }
        return res;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
         int []left=new int[n];
         int []upd=new int[2*n-1];
         int []ld=new int[2*n-1];
         solve(0,board,ans,left,upd,ld,n);
         return ans;
    }
    
    }
