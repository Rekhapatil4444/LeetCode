class Solution {
     public boolean isSpeed(int[] piles, int h,int k) {
        int upper=0;
        for(int i=0;i<piles.length;i++){
            int temp=piles[i]/k;
            if(piles[i]%k!=0){
                temp++;
            }
            upper+=temp;
            if(upper>h){
                return false;
            }
        }
        return true;
        }
    public int minEatingSpeed(int[] piles, int h) {
      int l=1;
      int r=(int)Math.pow(10,9);
      while(l<=r){
        int mid=l+(r-l)/2;
        if(isSpeed(piles,h,mid)){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
      }
      return l;
      }
}