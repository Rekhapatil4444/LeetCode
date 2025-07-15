class Solution {
    public boolean fun(int [][]matrix,int y,int x){
        int r=matrix.length;
        int c=matrix[0].length;
        int i=y;
        int j=x;
        int ans=matrix[i][j];
        boolean b=true;
        while(i<r && j<c)
        {
            if(matrix[i][j]!=ans)
            {
                b=false;
            }
            i++;
            j++;
        }
        return b;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean b=true;
        int r=matrix.length;
        int c=matrix[0].length;
        for(int j=0;j<c;j++)
        {
            boolean ans=fun(matrix,0,j);
            if(ans==false){
                b=false;
            }
             
         }
       for(int i=1;i<r;i++)
       {
        boolean ans=fun(matrix,i,0);
            if(ans==false){
                b=false;
            }
           
       }
       return b;
    }
}