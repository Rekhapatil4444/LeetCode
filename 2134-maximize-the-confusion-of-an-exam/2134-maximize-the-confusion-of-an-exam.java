class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int countf=0;
        int countt=0;
        int l=0;
        int ans=0;
        int n=answerKey.length();
        for(int r=0;r<n;r++){
            char ch=answerKey.charAt(r);
            if(ch=='T'){
                countt++;
            }
            else{
                countf++;
            }
            while(Math.min(countt,countf)>k){
                if(answerKey.charAt(l)=='T'){
                    countt-=1;
                }
                else{
                    countf-=1;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
      return ans;  
    }
}